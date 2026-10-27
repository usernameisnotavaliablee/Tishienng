package androidx.core.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ViewStructureCompat {
    private final java.lang.Object mWrappedObj;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(23)
    private static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static void setClassName(android.view.ViewStructure r0, java.lang.String r1) {
                r0.setClassName(r1)
                return
        }

        @androidx.annotation.DoNotInline
        static void setContentDescription(android.view.ViewStructure r0, java.lang.CharSequence r1) {
                r0.setContentDescription(r1)
                return
        }

        @androidx.annotation.DoNotInline
        static void setDimens(android.view.ViewStructure r0, int r1, int r2, int r3, int r4, int r5, int r6) {
                r0.setDimens(r1, r2, r3, r4, r5, r6)
                return
        }

        @androidx.annotation.DoNotInline
        static void setText(android.view.ViewStructure r0, java.lang.CharSequence r1) {
                r0.setText(r1)
                return
        }
    }

    private ViewStructureCompat(@androidx.annotation.NonNull android.view.ViewStructure r1) {
            r0 = this;
            r0.<init>()
            r0.mWrappedObj = r1
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(23)
    public static androidx.core.view.ViewStructureCompat toViewStructureCompat(@androidx.annotation.NonNull android.view.ViewStructure r1) {
            androidx.core.view.ViewStructureCompat r0 = new androidx.core.view.ViewStructureCompat
            r0.<init>(r1)
            return r0
    }

    public void setClassName(@androidx.annotation.NonNull java.lang.String r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lf
            java.lang.Object r0 = r2.mWrappedObj
            android.view.ViewStructure r0 = androidx.core.view.n0.a(r0)
            androidx.core.view.ViewStructureCompat.Api23Impl.setClassName(r0, r3)
        Lf:
            return
    }

    public void setContentDescription(@androidx.annotation.NonNull java.lang.CharSequence r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lf
            java.lang.Object r0 = r2.mWrappedObj
            android.view.ViewStructure r0 = androidx.core.view.n0.a(r0)
            androidx.core.view.ViewStructureCompat.Api23Impl.setContentDescription(r0, r3)
        Lf:
            return
    }

    public void setDimens(int r9, int r10, int r11, int r12, int r13, int r14) {
            r8 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L15
            java.lang.Object r0 = r8.mWrappedObj
            android.view.ViewStructure r1 = androidx.core.view.n0.a(r0)
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            androidx.core.view.ViewStructureCompat.Api23Impl.setDimens(r1, r2, r3, r4, r5, r6, r7)
        L15:
            return
    }

    public void setText(@androidx.annotation.NonNull java.lang.CharSequence r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lf
            java.lang.Object r0 = r2.mWrappedObj
            android.view.ViewStructure r0 = androidx.core.view.n0.a(r0)
            androidx.core.view.ViewStructureCompat.Api23Impl.setText(r0, r3)
        Lf:
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(23)
    public android.view.ViewStructure toViewStructure() {
            r1 = this;
            java.lang.Object r0 = r1.mWrappedObj
            android.view.ViewStructure r0 = androidx.core.view.n0.a(r0)
            return r0
    }
}
