package androidx.appcompat.text;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class AllCapsTransformationMethod implements android.text.method.TransformationMethod {
    private java.util.Locale mLocale;

    public AllCapsTransformationMethod(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            java.util.Locale r1 = r1.locale
            r0.mLocale = r1
            return
    }

    @Override // android.text.method.TransformationMethod
    public java.lang.CharSequence getTransformation(java.lang.CharSequence r1, android.view.View r2) {
            r0 = this;
            if (r1 == 0) goto Ld
            java.lang.String r1 = r1.toString()
            java.util.Locale r2 = r0.mLocale
            java.lang.String r1 = r1.toUpperCase(r2)
            return r1
        Ld:
            r1 = 0
            return r1
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(android.view.View r1, java.lang.CharSequence r2, boolean r3, int r4, android.graphics.Rect r5) {
            r0 = this;
            return
    }
}
