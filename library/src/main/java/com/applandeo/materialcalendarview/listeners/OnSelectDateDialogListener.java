package com.applandeo.materialcalendarview.listeners;

import java.util.Calendar;
import java.util.List;

import android.support.v7.app.AlertDialog;

/**
 * Created by Mateusz Kornakiewicz on 27.07.2017.
 */

public interface OnSelectDateDialogListener
{
    void onSelect(List<Calendar> calendar, AlertDialog alertDialog);
}
