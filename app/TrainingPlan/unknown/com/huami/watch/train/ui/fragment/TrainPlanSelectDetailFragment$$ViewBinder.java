// Generated code from Butter Knife. Do not modify!
package com.huami.watch.train.ui.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class TrainPlanSelectDetailFragment$$ViewBinder<T extends com.huami.watch.train.ui.fragment.TrainPlanSelectDetailFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492946, "field 'recyclerView_history'");
    target.recyclerView_history = finder.castView(view, 2131492946, "field 'recyclerView_history'");
  }

  @Override public void unbind(T target) {
    target.recyclerView_history = null;
  }
}
