package androidx.databinding.adapters;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.databinding.BindingMethods({@androidx.databinding.BindingMethod(attribute = "android:listSelector", method = "setSelector", type = android.widget.AbsListView.class), @androidx.databinding.BindingMethod(attribute = "android:scrollingCache", method = "setScrollingCacheEnabled", type = android.widget.AbsListView.class), @androidx.databinding.BindingMethod(attribute = "android:smoothScrollbar", method = "setSmoothScrollbarEnabled", type = android.widget.AbsListView.class), @androidx.databinding.BindingMethod(attribute = "android:onMovedToScrapHeap", method = "setRecyclerListener", type = android.widget.AbsListView.class)})
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class AbsListViewBindingAdapter {


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnScroll {
        void onScroll(android.widget.AbsListView r1, int r2, int r3, int r4);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnScrollStateChanged {
        void onScrollStateChanged(android.widget.AbsListView r1, int r2);
    }

    public AbsListViewBindingAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.databinding.BindingAdapter(requireAll = false, value = {"android:onScroll", "android:onScrollStateChanged"})
    public static void setOnScroll(android.widget.AbsListView r1, androidx.databinding.adapters.AbsListViewBindingAdapter.OnScroll r2, androidx.databinding.adapters.AbsListViewBindingAdapter.OnScrollStateChanged r3) {
            androidx.databinding.adapters.AbsListViewBindingAdapter$1 r0 = new androidx.databinding.adapters.AbsListViewBindingAdapter$1
            r0.<init>(r3, r2)
            r1.setOnScrollListener(r0)
            return
    }
}
