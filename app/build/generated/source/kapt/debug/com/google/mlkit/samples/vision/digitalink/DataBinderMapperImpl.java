package com.google.mlkit.samples.vision.digitalink;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.google.mlkit.samples.vision.digitalink.databinding.ActivityCallBindingImpl;
import com.google.mlkit.samples.vision.digitalink.databinding.ActivityPreviewBindingImpl;
import com.google.mlkit.samples.vision.digitalink.databinding.FragmentCallBindingImpl;
import com.google.mlkit.samples.vision.digitalink.databinding.FragmentDashboardBindingImpl;
import com.google.mlkit.samples.vision.digitalink.databinding.ItemUsersBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYCALL = 1;

  private static final int LAYOUT_ACTIVITYPREVIEW = 2;

  private static final int LAYOUT_FRAGMENTCALL = 3;

  private static final int LAYOUT_FRAGMENTDASHBOARD = 4;

  private static final int LAYOUT_ITEMUSERS = 5;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(5);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.mlkit.samples.vision.digitalink.R.layout.activity_call, LAYOUT_ACTIVITYCALL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.mlkit.samples.vision.digitalink.R.layout.activity_preview, LAYOUT_ACTIVITYPREVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.mlkit.samples.vision.digitalink.R.layout.fragment_call, LAYOUT_FRAGMENTCALL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.mlkit.samples.vision.digitalink.R.layout.fragment_dashboard, LAYOUT_FRAGMENTDASHBOARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.mlkit.samples.vision.digitalink.R.layout.item_users, LAYOUT_ITEMUSERS);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYCALL: {
          if ("layout/activity_call_0".equals(tag)) {
            return new ActivityCallBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_call is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPREVIEW: {
          if ("layout/activity_preview_0".equals(tag)) {
            return new ActivityPreviewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_preview is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCALL: {
          if ("layout/fragment_call_0".equals(tag)) {
            return new FragmentCallBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_call is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDASHBOARD: {
          if ("layout/fragment_dashboard_0".equals(tag)) {
            return new FragmentDashboardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_dashboard is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMUSERS: {
          if ("layout/item_users_0".equals(tag)) {
            return new ItemUsersBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_users is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(5);

    static {
      sKeys.put("layout/activity_call_0", com.google.mlkit.samples.vision.digitalink.R.layout.activity_call);
      sKeys.put("layout/activity_preview_0", com.google.mlkit.samples.vision.digitalink.R.layout.activity_preview);
      sKeys.put("layout/fragment_call_0", com.google.mlkit.samples.vision.digitalink.R.layout.fragment_call);
      sKeys.put("layout/fragment_dashboard_0", com.google.mlkit.samples.vision.digitalink.R.layout.fragment_dashboard);
      sKeys.put("layout/item_users_0", com.google.mlkit.samples.vision.digitalink.R.layout.item_users);
    }
  }
}
