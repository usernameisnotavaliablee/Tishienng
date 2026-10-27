package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class TagBundle {
    private static final java.lang.String CAMERAX_USER_TAG_PREFIX = "android.hardware.camera2.CaptureRequest.setTag.CX";
    private static final androidx.camera.core.impl.TagBundle EMPTY_TAGBUNDLE = null;
    private static final java.lang.String USER_TAG_PREFIX = "android.hardware.camera2.CaptureRequest.setTag.";
    protected final java.util.Map<java.lang.String, java.lang.Object> mTagMap;

    static {
            androidx.camera.core.impl.TagBundle r0 = new androidx.camera.core.impl.TagBundle
            android.util.ArrayMap r1 = new android.util.ArrayMap
            r1.<init>()
            r0.<init>(r1)
            androidx.camera.core.impl.TagBundle.EMPTY_TAGBUNDLE = r0
            return
    }

    protected TagBundle(@androidx.annotation.NonNull java.util.Map<java.lang.String, java.lang.Object> r1) {
            r0 = this;
            r0.<init>()
            r0.mTagMap = r1
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.TagBundle create(@androidx.annotation.NonNull android.util.Pair<java.lang.String, java.lang.Object> r2) {
            android.util.ArrayMap r0 = new android.util.ArrayMap
            r0.<init>()
            java.lang.Object r1 = r2.first
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r2.second
            r0.put(r1, r2)
            androidx.camera.core.impl.TagBundle r2 = new androidx.camera.core.impl.TagBundle
            r2.<init>(r0)
            return r2
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.TagBundle emptyBundle() {
            androidx.camera.core.impl.TagBundle r0 = androidx.camera.core.impl.TagBundle.EMPTY_TAGBUNDLE
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.TagBundle from(@androidx.annotation.NonNull androidx.camera.core.impl.TagBundle r4) {
            android.util.ArrayMap r0 = new android.util.ArrayMap
            r0.<init>()
            java.util.Set r1 = r4.listKeys()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r4.getTag(r2)
            r0.put(r2, r3)
            goto Ld
        L21:
            androidx.camera.core.impl.TagBundle r4 = new androidx.camera.core.impl.TagBundle
            r4.<init>(r0)
            return r4
    }

    @androidx.annotation.Nullable
    public java.lang.Object getTag(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mTagMap
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @androidx.annotation.NonNull
    public java.util.Set<java.lang.String> listKeys() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mTagMap
            java.util.Set r0 = r0.keySet()
            return r0
    }

    @androidx.annotation.NonNull
    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "android.hardware.camera2.CaptureRequest.setTag.CX"
            return r0
    }
}
