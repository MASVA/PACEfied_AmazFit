// Generated code from Butter Knife. Do not modify!
package com.huami.watch.train.ui.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class TrainRecordDetailFragment$$ViewBinder<T extends com.huami.watch.train.ui.fragment.TrainRecordDetailFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558483, "field 'myTrainTitle'");
    target.myTrainTitle = finder.castView(view, 2131558483, "field 'myTrainTitle'");
    view = finder.findRequiredView(source, 2131558485, "field 'trainProgress'");
    target.trainProgress = finder.castView(view, 2131558485, "field 'trainProgress'");
    view = finder.findRequiredView(source, 2131558488, "field 'trainDays'");
    target.trainDays = finder.castView(view, 2131558488, "field 'trainDays'");
    view = finder.findRequiredView(source, 2131558490, "field 'trainMils'");
    target.trainMils = finder.castView(view, 2131558490, "field 'trainMils'");
    view = finder.findRequiredView(source, 2131558486, "field 'progressBar'");
    target.progressBar = finder.castView(view, 2131558486, "field 'progressBar'");
    view = finder.findRequiredView(source, 2131558476, "field 'trainMileage'");
    target.trainMileage = finder.castView(view, 2131558476, "field 'trainMileage'");
  }

  @Override public void unbind(T target) {
    target.myTrainTitle = null;
    target.trainProgress = null;
    target.trainDays = null;
    target.trainMils = null;
    target.progressBar = null;
    target.trainMileage = null;
  }
}
