// Generated code from Butter Knife. Do not modify!
package com.huami.watch.train.ui.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class TrainWeeklyRecordDetailWearableAdapter$ViewHolder$$ViewBinder<T extends com.huami.watch.train.ui.adapter.TrainWeeklyRecordDetailWearableAdapter.ViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558433, "field 'trainDetailWeek'");
    target.trainDetailWeek = finder.castView(view, 2131558433, "field 'trainDetailWeek'");
    view = finder.findRequiredView(source, 2131558434, "field 'dayTrainContent'");
    target.dayTrainContent = finder.castView(view, 2131558434, "field 'dayTrainContent'");
    view = finder.findRequiredView(source, 2131558435, "field 'iconFinish'");
    target.iconFinish = finder.castView(view, 2131558435, "field 'iconFinish'");
    view = finder.findRequiredView(source, 2131558436, "field 'finishStatus'");
    target.finishStatus = finder.castView(view, 2131558436, "field 'finishStatus'");
  }

  @Override public void unbind(T target) {
    target.trainDetailWeek = null;
    target.dayTrainContent = null;
    target.iconFinish = null;
    target.finishStatus = null;
  }
}
