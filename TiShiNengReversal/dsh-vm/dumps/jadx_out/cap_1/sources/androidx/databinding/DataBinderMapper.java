package androidx.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class DataBinderMapper {
    public DataBinderMapper() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public java.util.List<androidx.databinding.DataBinderMapper> collectDependencies() {
            r1 = this;
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
    }

    public abstract java.lang.String convertBrIdToString(int r1);

    public abstract androidx.databinding.ViewDataBinding getDataBinder(androidx.databinding.DataBindingComponent r1, android.view.View r2, int r3);

    public abstract androidx.databinding.ViewDataBinding getDataBinder(androidx.databinding.DataBindingComponent r1, android.view.View[] r2, int r3);

    public abstract int getLayoutId(java.lang.String r1);
}
