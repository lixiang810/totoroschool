package com.totoro.school.adapter.common;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;

public class SelectSchoolAdapter$ViewHolder_ViewBinding
  implements Unbinder
{
  private SelectSchoolAdapter.ViewHolder a;
  
  @UiThread
  public SelectSchoolAdapter$ViewHolder_ViewBinding(SelectSchoolAdapter.ViewHolder paramViewHolder, View paramView)
  {
    this.a = paramViewHolder;
    paramViewHolder.tvConent = ((TextView)Utils.findRequiredViewAsType(paramView, 2131296682, "field 'tvConent'", TextView.class));
  }
  
  @CallSuper
  public void unbind()
  {
    SelectSchoolAdapter.ViewHolder localViewHolder = this.a;
    if (localViewHolder != null)
    {
      this.a = null;
      localViewHolder.tvConent = null;
      return;
    }
    throw new IllegalStateException("Bindings already cleared.");
  }
}


/* Location:              C:\Users\lixia\Desktop\android反编译三件套\dex2jar-2.0\classes-dex2jar.jar!\com\totoro\school\adapter\common\SelectSchoolAdapter$ViewHolder_ViewBinding.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */