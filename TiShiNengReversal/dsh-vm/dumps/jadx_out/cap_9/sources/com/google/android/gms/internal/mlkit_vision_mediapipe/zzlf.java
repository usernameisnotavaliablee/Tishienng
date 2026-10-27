package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzlf implements java.util.Iterator {
    private final java.util.Iterator zza;

    public zzlf(java.util.Iterator r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            java.util.Iterator r0 = r1.zza
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
            r3 = this;
            java.util.Iterator r0 = r3.zza
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getValue()
            boolean r1 = r1 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzlg
            if (r1 == 0) goto L17
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzle r1 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzle
            r2 = 0
            r1.<init>(r0, r2)
            return r1
        L17:
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            java.util.Iterator r0 = r1.zza
            r0.remove()
            return
    }
}
