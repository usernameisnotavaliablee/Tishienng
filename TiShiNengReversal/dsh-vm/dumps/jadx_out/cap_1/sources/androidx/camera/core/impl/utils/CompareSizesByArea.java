package androidx.camera.core.impl.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CompareSizesByArea implements java.util.Comparator<android.util.Size> {
    private boolean mReverse;

    public CompareSizesByArea() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public CompareSizesByArea(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.mReverse = r1
            return
    }

    /* renamed from: compare, reason: avoid collision after fix types in other method */
    public int compare2(@androidx.annotation.NonNull android.util.Size r5, @androidx.annotation.NonNull android.util.Size r6) {
            r4 = this;
            int r0 = r5.getWidth()
            long r0 = (long) r0
            int r5 = r5.getHeight()
            long r2 = (long) r5
            long r0 = r0 * r2
            int r5 = r6.getWidth()
            long r2 = (long) r5
            int r5 = r6.getHeight()
            long r5 = (long) r5
            long r2 = r2 * r5
            long r0 = r0 - r2
            int r5 = java.lang.Long.signum(r0)
            boolean r6 = r4.mReverse
            if (r6 == 0) goto L23
            int r5 = r5 * (-1)
        L23:
            return r5
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(@androidx.annotation.NonNull android.util.Size r1, @androidx.annotation.NonNull android.util.Size r2) {
            r0 = this;
            android.util.Size r1 = (android.util.Size) r1
            android.util.Size r2 = (android.util.Size) r2
            int r1 = r0.compare2(r1, r2)
            return r1
    }
}
