// Generated code from Butter Knife. Do not modify!
package com.huami.watch.train.ui.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class TrainSelectDetailHeaderAdapter$ItemHolder$$ViewBinder<T extends com.huami.watch.train.ui.adapter.TrainSelectDetailHeaderAdapter.ItemHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558420, "field 'trainRecordTitle'");
    target.trainRecordTitle = finder.castView(view, 2131558420, "field 'trainRecordTitle'");
    view = finder.findRequiredView(source, 2131558424, "field 'txtStartDate'");
    target.txtStartDate = finder.castView(view, 2131558424, "field 'txtStartDate'");
    view = finder.findRequiredView(source, 2131558425, "field 'txtEndDate'");
    target.txtEndDate = finder.castView(view, 2131558425, "field 'txtEndDate'");
    view = finder.findRequiredView(source, 2131558426, "field 'circleProgressView'");
    target.circleProgressView = finder.castView(view, 2131558426, "field 'circleProgressView'");
    view = finder.findRequiredView(source, 2131558427, "field 'txtProgressLevel'");
    target.txtProgressLevel = finder.castView(view, 2131558427, "field 'txtProgressLevel'");
  }

  @Override public void unbind(T target) {
    target.trainRecordTitle = null;
    target.txtStartDate = null;
    target.txtEndDate = null;
    target.circleProgressView = null;
    target.txtProgressLevel = null;
  }
}
