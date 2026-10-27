package androidx.core.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
/* synthetic */ class ViewKt$ancestors$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<android.view.ViewParent, android.view.ViewParent> {
    public static final androidx.core.view.ViewKt$ancestors$1 INSTANCE = null;

    static {
            androidx.core.view.ViewKt$ancestors$1 r0 = new androidx.core.view.ViewKt$ancestors$1
            r0.<init>()
            androidx.core.view.ViewKt$ancestors$1.INSTANCE = r0
            return
    }

    ViewKt$ancestors$1() {
            r6 = this;
            java.lang.String r4 = "getParent()Landroid/view/ViewParent;"
            r5 = 0
            r1 = 1
            java.lang.Class<android.view.ViewParent> r2 = android.view.ViewParent.class
            java.lang.String r3 = "getParent"
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public final android.view.ViewParent invoke(@org.jetbrains.annotations.NotNull android.view.ViewParent r1) {
            r0 = this;
            android.view.ViewParent r1 = r1.getParent()
            return r1
    }

    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
            r0 = this;
            android.view.ViewParent r1 = (android.view.ViewParent) r1
            android.view.ViewParent r1 = r0.invoke(r1)
            return r1
    }
}
