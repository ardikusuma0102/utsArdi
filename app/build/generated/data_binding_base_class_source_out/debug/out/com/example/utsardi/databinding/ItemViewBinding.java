// Generated by view binder compiler. Do not edit!
package com.example.utsardi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.utsardi.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class ItemViewBinding implements ViewBinding {
  @NonNull
  private final Button rootView;

  @NonNull
  public final Button buttonItem;

  private ItemViewBinding(@NonNull Button rootView, @NonNull Button buttonItem) {
    this.rootView = rootView;
    this.buttonItem = buttonItem;
  }

  @Override
  @NonNull
  public Button getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_view, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemViewBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    Button buttonItem = (Button) rootView;

    return new ItemViewBinding((Button) rootView, buttonItem);
  }
}
