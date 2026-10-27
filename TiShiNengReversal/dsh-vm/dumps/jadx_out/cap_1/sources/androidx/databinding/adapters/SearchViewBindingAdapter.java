package androidx.databinding.adapters;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.databinding.BindingMethods({@androidx.databinding.BindingMethod(attribute = "android:onQueryTextFocusChange", method = "setOnQueryTextFocusChangeListener", type = android.widget.SearchView.class), @androidx.databinding.BindingMethod(attribute = "android:onSearchClick", method = "setOnSearchClickListener", type = android.widget.SearchView.class), @androidx.databinding.BindingMethod(attribute = "android:onClose", method = "setOnCloseListener", type = android.widget.SearchView.class)})
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class SearchViewBindingAdapter {



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @android.annotation.TargetApi(11)
    public interface OnQueryTextChange {
        boolean onQueryTextChange(java.lang.String r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @android.annotation.TargetApi(11)
    public interface OnQueryTextSubmit {
        boolean onQueryTextSubmit(java.lang.String r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @android.annotation.TargetApi(11)
    public interface OnSuggestionClick {
        boolean onSuggestionClick(int r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @android.annotation.TargetApi(11)
    public interface OnSuggestionSelect {
        boolean onSuggestionSelect(int r1);
    }

    public SearchViewBindingAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.databinding.BindingAdapter(requireAll = false, value = {"android:onQueryTextSubmit", "android:onQueryTextChange"})
    public static void setOnQueryTextListener(android.widget.SearchView r1, androidx.databinding.adapters.SearchViewBindingAdapter.OnQueryTextSubmit r2, androidx.databinding.adapters.SearchViewBindingAdapter.OnQueryTextChange r3) {
            if (r2 != 0) goto L9
            if (r3 != 0) goto L9
            r2 = 0
            r1.setOnQueryTextListener(r2)
            return
        L9:
            androidx.databinding.adapters.SearchViewBindingAdapter$1 r0 = new androidx.databinding.adapters.SearchViewBindingAdapter$1
            r0.<init>(r2, r3)
            r1.setOnQueryTextListener(r0)
            return
    }

    @androidx.databinding.BindingAdapter(requireAll = false, value = {"android:onSuggestionSelect", "android:onSuggestionClick"})
    public static void setOnSuggestListener(android.widget.SearchView r1, androidx.databinding.adapters.SearchViewBindingAdapter.OnSuggestionSelect r2, androidx.databinding.adapters.SearchViewBindingAdapter.OnSuggestionClick r3) {
            if (r2 != 0) goto L9
            if (r3 != 0) goto L9
            r2 = 0
            r1.setOnSuggestionListener(r2)
            return
        L9:
            androidx.databinding.adapters.SearchViewBindingAdapter$2 r0 = new androidx.databinding.adapters.SearchViewBindingAdapter$2
            r0.<init>(r2, r3)
            r1.setOnSuggestionListener(r0)
            return
    }
}
