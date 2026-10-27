package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class MutableTagBundle extends androidx.camera.core.impl.TagBundle {
    private MutableTagBundle(java.util.Map<java.lang.String, java.lang.Object> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.MutableTagBundle create() {
            androidx.camera.core.impl.MutableTagBundle r0 = new androidx.camera.core.impl.MutableTagBundle
            android.util.ArrayMap r1 = new android.util.ArrayMap
            r1.<init>()
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.MutableTagBundle from(@androidx.annotation.NonNull androidx.camera.core.impl.TagBundle r4) {
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
            androidx.camera.core.impl.MutableTagBundle r4 = new androidx.camera.core.impl.MutableTagBundle
            r4.<init>(r0)
            return r4
    }

    public void addTagBundle(@androidx.annotation.NonNull androidx.camera.core.impl.TagBundle r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mTagMap
            if (r0 == 0) goto Lb
            java.util.Map<java.lang.String, java.lang.Object> r2 = r2.mTagMap
            if (r2 == 0) goto Lb
            r0.putAll(r2)
        Lb:
            return
    }

    public void putTag(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.Object r3) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mTagMap
            r0.put(r2, r3)
            return
    }
}
