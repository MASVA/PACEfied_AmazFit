// Generated code from Butter Knife. Do not modify!
package com.huami.watch.train.ui.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class TrainRecordDetailListViewAdapter$ViewHolder$$ViewBinder<T extends com.huami.watch.train.ui.adapter.TrainRecordDetailListViewAdapter.ViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492896, "field 'weeklyNumber'");
    target.weeklyNumber = finder.castView(view, 2131492896, "field 'weeklyNumber'");
    view = finder.findRequiredView(source, 2131492895, "field 'dayTrainStatus'");
    target.dayTrainStatus = finder.castView(view, 2131492895, "field 'dayTrainStatus'");
    view = finder.findRequiredView(source, 2131492894, "field 'currentItemStatus'");
    target.currentItemStatus = finder.castView(view, 2131492894, "field 'currentItemStatus'");
  }

  @Override public void unbind(T target) {
    target.weeklyNumber = null;
    target.dayTrainStatus = null;
    target.currentItemStatus = null;
  }
}
