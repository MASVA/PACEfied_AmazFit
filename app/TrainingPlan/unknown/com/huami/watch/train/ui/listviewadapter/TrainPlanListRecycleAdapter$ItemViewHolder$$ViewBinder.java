// Generated code from Butter Knife. Do not modify!
package com.huami.watch.train.ui.listviewadapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class TrainPlanListRecycleAdapter$ItemViewHolder$$ViewBinder<T extends com.huami.watch.train.ui.listviewadapter.TrainPlanListRecycleAdapter.ItemViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558428, "field 'imageView'");
    target.imageView = finder.castView(view, 2131558428, "field 'imageView'");
    view = finder.findRequiredView(source, 2131558429, "field 'train_plan'");
    target.train_plan = finder.castView(view, 2131558429, "field 'train_plan'");
  }

  @Override public void unbind(T target) {
    target.imageView = null;
    target.train_plan = null;
  }
}
