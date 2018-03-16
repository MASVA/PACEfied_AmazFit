// Generated code from Butter Knife. Do not modify!
package com.huami.watch.train.ui.listviewadapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ListTitleRecycleBaseAdapter$HeaderViewHolder$$ViewBinder<T extends com.huami.watch.train.ui.listviewadapter.ListTitleRecycleBaseAdapter.HeaderViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558468, "field 'title'");
    target.title = finder.castView(view, 2131558468, "field 'title'");
    view = finder.findRequiredView(source, 2131558469, "field 'smallTitle'");
    target.smallTitle = finder.castView(view, 2131558469, "field 'smallTitle'");
  }

  @Override public void unbind(T target) {
    target.title = null;
    target.smallTitle = null;
  }
}
