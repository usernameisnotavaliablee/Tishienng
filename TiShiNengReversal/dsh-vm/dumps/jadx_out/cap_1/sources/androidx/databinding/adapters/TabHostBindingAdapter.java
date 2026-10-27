package androidx.databinding.adapters;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class TabHostBindingAdapter {


    public TabHostBindingAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.databinding.InverseBindingAdapter(attribute = "android:currentTab")
    public static int getCurrentTab(android.widget.TabHost r0) {
            int r0 = r0.getCurrentTab()
            return r0
    }

    @androidx.databinding.InverseBindingAdapter(attribute = "android:currentTab")
    public static java.lang.String getCurrentTabTag(android.widget.TabHost r0) {
            java.lang.String r0 = r0.getCurrentTabTag()
            return r0
    }

    @androidx.databinding.BindingAdapter({"android:currentTab"})
    public static void setCurrentTab(android.widget.TabHost r1, int r2) {
            int r0 = r1.getCurrentTab()
            if (r0 == r2) goto L9
            r1.setCurrentTab(r2)
        L9:
            return
    }

    @androidx.databinding.BindingAdapter({"android:currentTab"})
    public static void setCurrentTabTag(android.widget.TabHost r2, java.lang.String r3) {
            java.lang.String r0 = r2.getCurrentTabTag()
            if (r0 == 0) goto Lc
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L10
        Lc:
            if (r0 != 0) goto L13
            if (r3 == 0) goto L13
        L10:
            r2.setCurrentTabByTag(r3)
        L13:
            return
    }

    @androidx.databinding.BindingAdapter(requireAll = false, value = {"android:onTabChanged", "android:currentTabAttrChanged"})
    public static void setListeners(android.widget.TabHost r1, android.widget.TabHost.OnTabChangeListener r2, androidx.databinding.InverseBindingListener r3) {
            if (r3 != 0) goto L6
            r1.setOnTabChangedListener(r2)
            return
        L6:
            androidx.databinding.adapters.TabHostBindingAdapter$1 r0 = new androidx.databinding.adapters.TabHostBindingAdapter$1
            r0.<init>(r2, r3)
            r1.setOnTabChangedListener(r0)
            return
    }
}
