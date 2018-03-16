// Generated code from Butter Knife. Do not modify!
package com.huami.watch.train.ui.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class TrainSelectDetailHeaderAdapter$HeadHolder$$ViewBinder<T extends com.huami.watch.train.ui.adapter.TrainSelectDetailHeaderAdapter.HeadHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558475, "field 'numberTrainDays'");
    target.numberTrainDays = finder.castView(view, 2131558475, "field 'numberTrainDays'");
    view = finder.findRequiredView(source, 2131558477, "field 'numberTrainMils'");
    target.numberTrainMils = finder.castView(view, 2131558477, "field 'numberTrainMils'");
    view = finder.findRequiredView(source, 2131558476, "field 'trainMileage'");
    target.trainMileage = finder.castView(view, 2131558476, "field 'trainMileage'");
  }

  @Override public void unbind(T target) {
    target.numberTrainDays = null;
    target.numberTrainMils = null;
    target.trainMileage = null;
  }
}
