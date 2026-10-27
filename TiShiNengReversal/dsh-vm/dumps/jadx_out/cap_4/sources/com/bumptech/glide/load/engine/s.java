package com.bumptech.glide.load.engine;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class s<Data, ResourceType, Transcode> {
    private final java.lang.Class<Data> a;
    private final androidx.core.util.Pools.Pool<java.util.List<java.lang.Throwable>> b;
    private final java.util.List<? extends com.bumptech.glide.load.engine.i<Data, ResourceType, Transcode>> c;
    private final java.lang.String d;

    public s(java.lang.Class<Data> r1, java.lang.Class<ResourceType> r2, java.lang.Class<Transcode> r3, java.util.List<com.bumptech.glide.load.engine.i<Data, ResourceType, Transcode>> r4, androidx.core.util.Pools.Pool<java.util.List<java.lang.Throwable>> r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r5
            java.util.Collection r4 = com.bumptech.glide.util.k.c(r4)
            java.util.List r4 = (java.util.List) r4
            r0.c = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Failed LoadPath{"
            r4.append(r5)
            java.lang.String r1 = r1.getSimpleName()
            r4.append(r1)
            java.lang.String r1 = "->"
            r4.append(r1)
            java.lang.String r2 = r2.getSimpleName()
            r4.append(r2)
            r4.append(r1)
            java.lang.String r1 = r3.getSimpleName()
            r4.append(r1)
            java.lang.String r1 = "}"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r0.d = r1
            return
    }

    private com.bumptech.glide.load.engine.u<Transcode> c(com.bumptech.glide.load.data.e<Data> r12, @androidx.annotation.NonNull com.bumptech.glide.load.f r13, int r14, int r15, com.bumptech.glide.load.engine.i.a<ResourceType> r16, java.util.List<java.lang.Throwable> r17) throws com.bumptech.glide.load.engine.GlideException {
            r11 = this;
            r1 = r17
            java.util.List<? extends com.bumptech.glide.load.engine.i<Data, ResourceType, Transcode>> r0 = r11.c
            int r2 = r0.size()
            r0 = 0
            r3 = 0
            r3 = r0
            r4 = 0
        Lc:
            if (r4 >= r2) goto L2d
            java.util.List<? extends com.bumptech.glide.load.engine.i<Data, ResourceType, Transcode>> r0 = r11.c
            java.lang.Object r0 = r0.get(r4)
            r5 = r0
            com.bumptech.glide.load.engine.i r5 = (com.bumptech.glide.load.engine.i) r5
            r6 = r12
            r9 = r13
            r7 = r14
            r8 = r15
            r10 = r16
            com.bumptech.glide.load.engine.u r0 = r5.a(r6, r7, r8, r9, r10)     // Catch: com.bumptech.glide.load.engine.GlideException -> L23
            r3 = r0
            goto L27
        L23:
            r0 = move-exception
            r1.add(r0)
        L27:
            if (r3 == 0) goto L2a
            goto L2d
        L2a:
            int r4 = r4 + 1
            goto Lc
        L2d:
            if (r3 == 0) goto L30
            return r3
        L30:
            com.bumptech.glide.load.engine.GlideException r12 = new com.bumptech.glide.load.engine.GlideException
            java.lang.String r13 = r11.d
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r1)
            r12.<init>(r13, r14)
            throw r12
    }

    public java.lang.Class<Data> a() {
            r1 = this;
            java.lang.Class<Data> r0 = r1.a
            return r0
    }

    public com.bumptech.glide.load.engine.u<Transcode> b(com.bumptech.glide.load.data.e<Data> r9, @androidx.annotation.NonNull com.bumptech.glide.load.f r10, int r11, int r12, com.bumptech.glide.load.engine.i.a<ResourceType> r13) throws com.bumptech.glide.load.engine.GlideException {
            r8 = this;
            androidx.core.util.Pools$Pool<java.util.List<java.lang.Throwable>> r0 = r8.b
            java.lang.Object r0 = r0.acquire()
            java.lang.Object r0 = com.bumptech.glide.util.k.d(r0)
            r7 = r0
            java.util.List r7 = (java.util.List) r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            com.bumptech.glide.load.engine.u r9 = r1.c(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L1d
            androidx.core.util.Pools$Pool<java.util.List<java.lang.Throwable>> r10 = r1.b
            r10.release(r7)
            return r9
        L1d:
            r0 = move-exception
            r9 = r0
            androidx.core.util.Pools$Pool<java.util.List<java.lang.Throwable>> r10 = r1.b
            r10.release(r7)
            throw r9
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "LoadPath{decodePaths="
            r0.append(r1)
            java.util.List<? extends com.bumptech.glide.load.engine.i<Data, ResourceType, Transcode>> r1 = r2.c
            java.lang.Object[] r1 = r1.toArray()
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
