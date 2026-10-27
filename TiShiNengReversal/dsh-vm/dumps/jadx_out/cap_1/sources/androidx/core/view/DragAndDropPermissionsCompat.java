package androidx.core.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class DragAndDropPermissionsCompat {
    private final android.view.DragAndDropPermissions mDragAndDropPermissions;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(24)
    static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static void release(android.view.DragAndDropPermissions r0) {
                r0.release()
                return
        }

        @androidx.annotation.DoNotInline
        static android.view.DragAndDropPermissions requestDragAndDropPermissions(android.app.Activity r0, android.view.DragEvent r1) {
                android.view.DragAndDropPermissions r0 = r0.requestDragAndDropPermissions(r1)
                return r0
        }
    }

    private DragAndDropPermissionsCompat(android.view.DragAndDropPermissions r1) {
            r0 = this;
            r0.<init>()
            r0.mDragAndDropPermissions = r1
            return
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static androidx.core.view.DragAndDropPermissionsCompat request(@androidx.annotation.NonNull android.app.Activity r2, @androidx.annotation.NonNull android.view.DragEvent r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L12
            android.view.DragAndDropPermissions r2 = androidx.core.view.DragAndDropPermissionsCompat.Api24Impl.requestDragAndDropPermissions(r2, r3)
            if (r2 == 0) goto L12
            androidx.core.view.DragAndDropPermissionsCompat r3 = new androidx.core.view.DragAndDropPermissionsCompat
            r3.<init>(r2)
            return r3
        L12:
            r2 = 0
            return r2
    }

    public void release() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lb
            android.view.DragAndDropPermissions r0 = r2.mDragAndDropPermissions
            androidx.core.view.DragAndDropPermissionsCompat.Api24Impl.release(r0)
        Lb:
            return
    }
}
