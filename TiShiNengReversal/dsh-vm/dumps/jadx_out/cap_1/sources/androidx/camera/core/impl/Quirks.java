package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class Quirks {

    @androidx.annotation.NonNull
    private final java.util.List<androidx.camera.core.impl.Quirk> mQuirks;

    public Quirks(@androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.Quirk> r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.mQuirks = r0
            return
    }

    public boolean contains(@androidx.annotation.NonNull java.lang.Class<? extends androidx.camera.core.impl.Quirk> r3) {
            r2 = this;
            java.util.List<androidx.camera.core.impl.Quirk> r0 = r2.mQuirks
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            androidx.camera.core.impl.Quirk r1 = (androidx.camera.core.impl.Quirk) r1
            java.lang.Class r1 = r1.getClass()
            boolean r1 = r3.isAssignableFrom(r1)
            if (r1 == 0) goto L6
            r3 = 1
            return r3
        L1e:
            r3 = 0
            return r3
    }

    @androidx.annotation.Nullable
    public <T extends androidx.camera.core.impl.Quirk> T get(@androidx.annotation.NonNull java.lang.Class<T> r4) {
            r3 = this;
            java.util.List<androidx.camera.core.impl.Quirk> r0 = r3.mQuirks
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            androidx.camera.core.impl.Quirk r1 = (androidx.camera.core.impl.Quirk) r1
            java.lang.Class r2 = r1.getClass()
            if (r2 != r4) goto L6
            return r1
        L19:
            r4 = 0
            return r4
    }

    @androidx.annotation.NonNull
    public <T extends androidx.camera.core.impl.Quirk> java.util.List<T> getAll(@androidx.annotation.NonNull java.lang.Class<T> r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<androidx.camera.core.impl.Quirk> r1 = r4.mQuirks
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r1.next()
            androidx.camera.core.impl.Quirk r2 = (androidx.camera.core.impl.Quirk) r2
            java.lang.Class r3 = r2.getClass()
            boolean r3 = r5.isAssignableFrom(r3)
            if (r3 == 0) goto Lb
            r0.add(r2)
            goto Lb
        L25:
            return r0
    }
}
