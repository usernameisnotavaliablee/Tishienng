package androidx.core.view.contentcapture;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ContentCaptureSessionCompat {
    private static final java.lang.String KEY_VIEW_TREE_APPEARED = "TREAT_AS_VIEW_TREE_APPEARED";
    private static final java.lang.String KEY_VIEW_TREE_APPEARING = "TREAT_AS_VIEW_TREE_APPEARING";
    private final android.view.View mView;
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
        static android.os.Bundle getExtras(android.view.ViewStructure r0) {
                android.os.Bundle r0 = r0.getExtras()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(29)
    private static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.view.autofill.AutofillId newAutofillId(android.view.contentcapture.ContentCaptureSession r0, android.view.autofill.AutofillId r1, long r2) {
                android.view.autofill.AutofillId r0 = r0.newAutofillId(r1, r2)
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.view.ViewStructure newViewStructure(android.view.contentcapture.ContentCaptureSession r0, android.view.View r1) {
                android.view.ViewStructure r0 = r0.newViewStructure(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.view.ViewStructure newVirtualViewStructure(android.view.contentcapture.ContentCaptureSession r0, android.view.autofill.AutofillId r1, long r2) {
                android.view.ViewStructure r0 = r0.newVirtualViewStructure(r1, r2)
                return r0
        }

        @androidx.annotation.DoNotInline
        static void notifyViewAppeared(android.view.contentcapture.ContentCaptureSession r0, android.view.ViewStructure r1) {
                r0.notifyViewAppeared(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void notifyViewTextChanged(android.view.contentcapture.ContentCaptureSession r0, android.view.autofill.AutofillId r1, java.lang.CharSequence r2) {
                r0.notifyViewTextChanged(r1, r2)
                return
        }

        @androidx.annotation.DoNotInline
        static void notifyViewsDisappeared(android.view.contentcapture.ContentCaptureSession r0, android.view.autofill.AutofillId r1, long[] r2) {
                r0.notifyViewsDisappeared(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(34)
    private static class Api34Impl {
        private Api34Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static void notifyViewsAppeared(android.view.contentcapture.ContentCaptureSession r0, java.util.List<android.view.ViewStructure> r1) {
                r0.notifyViewsAppeared(r1)
                return
        }
    }

    @androidx.annotation.RequiresApi(29)
    private ContentCaptureSessionCompat(@androidx.annotation.NonNull android.view.contentcapture.ContentCaptureSession r1, @androidx.annotation.NonNull android.view.View r2) {
            r0 = this;
            r0.<init>()
            r0.mWrappedObj = r1
            r0.mView = r2
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(29)
    public static androidx.core.view.contentcapture.ContentCaptureSessionCompat toContentCaptureSessionCompat(@androidx.annotation.NonNull android.view.contentcapture.ContentCaptureSession r1, @androidx.annotation.NonNull android.view.View r2) {
            androidx.core.view.contentcapture.ContentCaptureSessionCompat r0 = new androidx.core.view.contentcapture.ContentCaptureSessionCompat
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.Nullable
    public android.view.autofill.AutofillId newAutofillId(long r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L1e
            java.lang.Object r0 = r2.mWrappedObj
            android.view.contentcapture.ContentCaptureSession r0 = androidx.core.view.contentcapture.a.a(r0)
            android.view.View r1 = r2.mView
            androidx.core.view.autofill.AutofillIdCompat r1 = androidx.core.view.ViewCompat.getAutofillId(r1)
            java.util.Objects.requireNonNull(r1)
            android.view.autofill.AutofillId r1 = r1.toAutofillId()
            android.view.autofill.AutofillId r3 = androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.newAutofillId(r0, r1, r3)
            return r3
        L1e:
            r3 = 0
            return r3
    }

    @androidx.annotation.Nullable
    public androidx.core.view.ViewStructureCompat newVirtualViewStructure(@androidx.annotation.NonNull android.view.autofill.AutofillId r3, long r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L15
            java.lang.Object r0 = r2.mWrappedObj
            android.view.contentcapture.ContentCaptureSession r0 = androidx.core.view.contentcapture.a.a(r0)
            android.view.ViewStructure r3 = androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.newVirtualViewStructure(r0, r3, r4)
            androidx.core.view.ViewStructureCompat r3 = androidx.core.view.ViewStructureCompat.toViewStructureCompat(r3)
            return r3
        L15:
            r3 = 0
            return r3
    }

    public void notifyViewTextChanged(@androidx.annotation.NonNull android.view.autofill.AutofillId r3, @androidx.annotation.Nullable java.lang.CharSequence r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lf
            java.lang.Object r0 = r2.mWrappedObj
            android.view.contentcapture.ContentCaptureSession r0 = androidx.core.view.contentcapture.a.a(r0)
            androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.notifyViewTextChanged(r0, r3, r4)
        Lf:
            return
    }

    public void notifyViewsAppeared(@androidx.annotation.NonNull java.util.List<android.view.ViewStructure> r5) {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L10
            java.lang.Object r0 = r4.mWrappedObj
            android.view.contentcapture.ContentCaptureSession r0 = androidx.core.view.contentcapture.a.a(r0)
            androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api34Impl.notifyViewsAppeared(r0, r5)
            return
        L10:
            r1 = 29
            if (r0 < r1) goto L6c
            java.lang.Object r0 = r4.mWrappedObj
            android.view.contentcapture.ContentCaptureSession r0 = androidx.core.view.contentcapture.a.a(r0)
            android.view.View r1 = r4.mView
            android.view.ViewStructure r0 = androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.newViewStructure(r0, r1)
            android.os.Bundle r1 = androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api23Impl.getExtras(r0)
            java.lang.String r2 = "TREAT_AS_VIEW_TREE_APPEARING"
            r3 = 1
            r1.putBoolean(r2, r3)
            java.lang.Object r1 = r4.mWrappedObj
            android.view.contentcapture.ContentCaptureSession r1 = androidx.core.view.contentcapture.a.a(r1)
            androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.notifyViewAppeared(r1, r0)
            r0 = 0
        L34:
            int r1 = r5.size()
            if (r0 >= r1) goto L4e
            java.lang.Object r1 = r4.mWrappedObj
            android.view.contentcapture.ContentCaptureSession r1 = androidx.core.view.contentcapture.a.a(r1)
            java.lang.Object r2 = r5.get(r0)
            android.view.ViewStructure r2 = androidx.core.view.n0.a(r2)
            androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.notifyViewAppeared(r1, r2)
            int r0 = r0 + 1
            goto L34
        L4e:
            java.lang.Object r5 = r4.mWrappedObj
            android.view.contentcapture.ContentCaptureSession r5 = androidx.core.view.contentcapture.a.a(r5)
            android.view.View r0 = r4.mView
            android.view.ViewStructure r5 = androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.newViewStructure(r5, r0)
            android.os.Bundle r0 = androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api23Impl.getExtras(r5)
            java.lang.String r1 = "TREAT_AS_VIEW_TREE_APPEARED"
            r0.putBoolean(r1, r3)
            java.lang.Object r0 = r4.mWrappedObj
            android.view.contentcapture.ContentCaptureSession r0 = androidx.core.view.contentcapture.a.a(r0)
            androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.notifyViewAppeared(r0, r5)
        L6c:
            return
    }

    public void notifyViewsDisappeared(@androidx.annotation.NonNull long[] r5) {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L1d
            java.lang.Object r0 = r4.mWrappedObj
            android.view.contentcapture.ContentCaptureSession r0 = androidx.core.view.contentcapture.a.a(r0)
            android.view.View r1 = r4.mView
            androidx.core.view.autofill.AutofillIdCompat r1 = androidx.core.view.ViewCompat.getAutofillId(r1)
            java.util.Objects.requireNonNull(r1)
            android.view.autofill.AutofillId r1 = r1.toAutofillId()
            androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.notifyViewsDisappeared(r0, r1, r5)
            return
        L1d:
            r1 = 29
            if (r0 < r1) goto L74
            java.lang.Object r0 = r4.mWrappedObj
            android.view.contentcapture.ContentCaptureSession r0 = androidx.core.view.contentcapture.a.a(r0)
            android.view.View r1 = r4.mView
            android.view.ViewStructure r0 = androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.newViewStructure(r0, r1)
            android.os.Bundle r1 = androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api23Impl.getExtras(r0)
            java.lang.String r2 = "TREAT_AS_VIEW_TREE_APPEARING"
            r3 = 1
            r1.putBoolean(r2, r3)
            java.lang.Object r1 = r4.mWrappedObj
            android.view.contentcapture.ContentCaptureSession r1 = androidx.core.view.contentcapture.a.a(r1)
            androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.notifyViewAppeared(r1, r0)
            java.lang.Object r0 = r4.mWrappedObj
            android.view.contentcapture.ContentCaptureSession r0 = androidx.core.view.contentcapture.a.a(r0)
            android.view.View r1 = r4.mView
            androidx.core.view.autofill.AutofillIdCompat r1 = androidx.core.view.ViewCompat.getAutofillId(r1)
            java.util.Objects.requireNonNull(r1)
            android.view.autofill.AutofillId r1 = r1.toAutofillId()
            androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.notifyViewsDisappeared(r0, r1, r5)
            java.lang.Object r5 = r4.mWrappedObj
            android.view.contentcapture.ContentCaptureSession r5 = androidx.core.view.contentcapture.a.a(r5)
            android.view.View r0 = r4.mView
            android.view.ViewStructure r5 = androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.newViewStructure(r5, r0)
            android.os.Bundle r0 = androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api23Impl.getExtras(r5)
            java.lang.String r1 = "TREAT_AS_VIEW_TREE_APPEARED"
            r0.putBoolean(r1, r3)
            java.lang.Object r0 = r4.mWrappedObj
            android.view.contentcapture.ContentCaptureSession r0 = androidx.core.view.contentcapture.a.a(r0)
            androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.notifyViewAppeared(r0, r5)
        L74:
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(29)
    public android.view.contentcapture.ContentCaptureSession toContentCaptureSession() {
            r1 = this;
            java.lang.Object r0 = r1.mWrappedObj
            android.view.contentcapture.ContentCaptureSession r0 = androidx.core.view.contentcapture.a.a(r0)
            return r0
    }
}
