package com.test.dieman.randomtest;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.widget.RemoteViews;


/**
 * Implementation of App Widget functionality.
 */
public class NewAppWidget extends AppWidgetProvider {

    public static int value=0;

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        // There may be multiple widgets active, so update all of them
        final int N = appWidgetIds.length;
        for (int i = 0; i < N; i++) {
            updateAppWidget(context, appWidgetManager, appWidgetIds[i]);
        }
    }


    @Override
    public void onEnabled(Context context) {
        // Enter relevant functionality for when the first widget is created
    }

    @Override
    public void onDisabled(Context context) {
        // Enter relevant functionality for when the last widget is disabled
    }

    static void updateAppWidget(Context context, AppWidgetManager appWidgetManager,
                                int appWidgetId) {

        CharSequence widgetText;
        RemoteViews views=null;
        if(value==0) {
            widgetText = context.getString(R.string.appwidget_text);
            views.setTextViewText(R.id.appwidget_text, widgetText);
            value=1;
        }
        else
        {
            widgetText = context.getString(R.string.widget_test_text);
            views.setTextViewText(R.id.widget_test_text, widgetText);

        }
        // Construct the RemoteViews object
         views = new RemoteViews(context.getPackageName(), R.layout.new_app_widget);
        // Instruct the widget manager to update the widget
        appWidgetManager.updateAppWidget(appWidgetId, views);
    }
}


