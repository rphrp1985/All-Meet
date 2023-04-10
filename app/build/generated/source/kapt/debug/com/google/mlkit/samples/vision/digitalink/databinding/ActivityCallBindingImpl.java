package com.google.mlkit.samples.vision.digitalink.databinding;
import com.google.mlkit.samples.vision.digitalink.R;
import com.google.mlkit.samples.vision.digitalink.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityCallBindingImpl extends ActivityCallBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.group_call_constraint_layout_header, 3);
        sViewsWithIds.put(R.id.group_call_linear_layout_room_id_info, 4);
        sViewsWithIds.put(R.id.group_call_text_view_room_id, 5);
        sViewsWithIds.put(R.id.group_call_image_view_camera_flip, 6);
        sViewsWithIds.put(R.id.group_call_image_view_speaker, 7);
        sViewsWithIds.put(R.id.group_call_constraint_layout_footer, 8);
        sViewsWithIds.put(R.id.group_call_image_view_exit, 9);
        sViewsWithIds.put(R.id.group_call_linear_layout_participants, 10);
        sViewsWithIds.put(R.id.group_call_recycler_view_participants, 11);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityCallBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ActivityCallBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.LinearLayout) bindings[4]
            , (com.airbnb.epoxy.EpoxyRecyclerView) bindings[11]
            , (android.widget.TextView) bindings[5]
            );
        this.groupCallImageViewAudioOnOff.setTag(null);
        this.groupCallImageViewVideoOnOff.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
        if ((dirtyFlags & 0x1L) != 0) {
            // api target 1

            this.groupCallImageViewAudioOnOff.setTag(true);
            this.groupCallImageViewVideoOnOff.setTag(true);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}