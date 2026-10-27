package com.bumptech.glide;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class Registry {
    public static final java.lang.String k = "Gif";

    /* renamed from: l, reason: collision with root package name */
    public static final java.lang.String f323l = "Bitmap";

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String f324m = "BitmapDrawable";

    /* renamed from: n, reason: collision with root package name */
    private static final java.lang.String f325n = "legacy_prepend_all";

    /* renamed from: o, reason: collision with root package name */
    private static final java.lang.String f326o = "legacy_append";
    private final com.bumptech.glide.load.model.p a;
    private final com.bumptech.glide.provider.a b;
    private final com.bumptech.glide.provider.e c;
    private final com.bumptech.glide.provider.f d;
    private final com.bumptech.glide.load.data.f e;
    private final com.bumptech.glide.load.resource.transcode.f f;
    private final com.bumptech.glide.provider.b g;
    private final com.bumptech.glide.provider.d h;
    private final com.bumptech.glide.provider.c i;
    private final androidx.core.util.Pools.Pool<java.util.List<java.lang.Throwable>> j;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class MissingComponentException extends java.lang.RuntimeException {
        public MissingComponentException(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class NoImageHeaderParserException extends com.bumptech.glide.Registry.MissingComponentException {
        public NoImageHeaderParserException() {
                r1 = this;
                java.lang.String r0 = "Failed to find image header parser."
                r1.<init>(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class NoModelLoaderAvailableException extends com.bumptech.glide.Registry.MissingComponentException {
        public NoModelLoaderAvailableException(@androidx.annotation.NonNull java.lang.Class<?> r3, @androidx.annotation.NonNull java.lang.Class<?> r4) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Failed to find any ModelLoaders for model: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = " and data: "
                r0.append(r3)
                r0.append(r4)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
        }

        public NoModelLoaderAvailableException(@androidx.annotation.NonNull java.lang.Object r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Failed to find any ModelLoaders registered for model class: "
                r0.append(r1)
                java.lang.Class r3 = r3.getClass()
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
        }

        public <M> NoModelLoaderAvailableException(@androidx.annotation.NonNull M r3, @androidx.annotation.NonNull java.util.List<com.bumptech.glide.load.model.n<M, ?>> r4) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Found ModelLoaders for model class: "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = ", but none that handle this specific model instance: "
                r0.append(r4)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class NoResultEncoderAvailableException extends com.bumptech.glide.Registry.MissingComponentException {
        public NoResultEncoderAvailableException(@androidx.annotation.NonNull java.lang.Class<?> r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Failed to find result encoder for resource class: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary."
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class NoSourceEncoderAvailableException extends com.bumptech.glide.Registry.MissingComponentException {
        public NoSourceEncoderAvailableException(@androidx.annotation.NonNull java.lang.Class<?> r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Failed to find source encoder for data class: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
        }
    }

    public Registry() {
            r3 = this;
            r3.<init>()
            com.bumptech.glide.provider.d r0 = new com.bumptech.glide.provider.d
            r0.<init>()
            r3.h = r0
            com.bumptech.glide.provider.c r0 = new com.bumptech.glide.provider.c
            r0.<init>()
            r3.i = r0
            androidx.core.util.Pools$Pool r0 = com.bumptech.glide.util.pool.a.f()
            r3.j = r0
            com.bumptech.glide.load.model.p r1 = new com.bumptech.glide.load.model.p
            r1.<init>(r0)
            r3.a = r1
            com.bumptech.glide.provider.a r0 = new com.bumptech.glide.provider.a
            r0.<init>()
            r3.b = r0
            com.bumptech.glide.provider.e r0 = new com.bumptech.glide.provider.e
            r0.<init>()
            r3.c = r0
            com.bumptech.glide.provider.f r0 = new com.bumptech.glide.provider.f
            r0.<init>()
            r3.d = r0
            com.bumptech.glide.load.data.f r0 = new com.bumptech.glide.load.data.f
            r0.<init>()
            r3.e = r0
            com.bumptech.glide.load.resource.transcode.f r0 = new com.bumptech.glide.load.resource.transcode.f
            r0.<init>()
            r3.f = r0
            com.bumptech.glide.provider.b r0 = new com.bumptech.glide.provider.b
            r0.<init>()
            r3.g = r0
            java.lang.String r0 = "Bitmap"
            java.lang.String r1 = "BitmapDrawable"
            java.lang.String r2 = "Gif"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            java.util.List r0 = java.util.Arrays.asList(r0)
            r3.z(r0)
            return
    }

    @androidx.annotation.NonNull
    private <Data, TResource, Transcode> java.util.List<com.bumptech.glide.load.engine.i<Data, TResource, Transcode>> f(@androidx.annotation.NonNull java.lang.Class<Data> r10, @androidx.annotation.NonNull java.lang.Class<TResource> r11, @androidx.annotation.NonNull java.lang.Class<Transcode> r12) {
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.bumptech.glide.provider.e r1 = r9.c
            java.util.List r11 = r1.d(r10, r11)
            java.util.Iterator r11 = r11.iterator()
        Lf:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L4b
            java.lang.Object r1 = r11.next()
            r4 = r1
            java.lang.Class r4 = (java.lang.Class) r4
            com.bumptech.glide.load.resource.transcode.f r1 = r9.f
            java.util.List r1 = r1.b(r4, r12)
            java.util.Iterator r1 = r1.iterator()
        L26:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lf
            java.lang.Object r2 = r1.next()
            r5 = r2
            java.lang.Class r5 = (java.lang.Class) r5
            com.bumptech.glide.provider.e r2 = r9.c
            java.util.List r6 = r2.b(r10, r4)
            com.bumptech.glide.load.resource.transcode.f r2 = r9.f
            com.bumptech.glide.load.resource.transcode.e r7 = r2.a(r4, r5)
            com.bumptech.glide.load.engine.i r2 = new com.bumptech.glide.load.engine.i
            androidx.core.util.Pools$Pool<java.util.List<java.lang.Throwable>> r8 = r9.j
            r3 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0.add(r2)
            goto L26
        L4b:
            return r0
    }

    @androidx.annotation.NonNull
    public <Data> com.bumptech.glide.Registry a(@androidx.annotation.NonNull java.lang.Class<Data> r2, @androidx.annotation.NonNull com.bumptech.glide.load.a<Data> r3) {
            r1 = this;
            com.bumptech.glide.provider.a r0 = r1.b
            r0.a(r2, r3)
            return r1
    }

    @androidx.annotation.NonNull
    public <TResource> com.bumptech.glide.Registry b(@androidx.annotation.NonNull java.lang.Class<TResource> r2, @androidx.annotation.NonNull com.bumptech.glide.load.h<TResource> r3) {
            r1 = this;
            com.bumptech.glide.provider.f r0 = r1.d
            r0.a(r2, r3)
            return r1
    }

    @androidx.annotation.NonNull
    public <Data, TResource> com.bumptech.glide.Registry c(@androidx.annotation.NonNull java.lang.Class<Data> r2, @androidx.annotation.NonNull java.lang.Class<TResource> r3, @androidx.annotation.NonNull com.bumptech.glide.load.g<Data, TResource> r4) {
            r1 = this;
            java.lang.String r0 = "legacy_append"
            r1.e(r0, r2, r3, r4)
            return r1
    }

    @androidx.annotation.NonNull
    public <Model, Data> com.bumptech.glide.Registry d(@androidx.annotation.NonNull java.lang.Class<Model> r2, @androidx.annotation.NonNull java.lang.Class<Data> r3, @androidx.annotation.NonNull com.bumptech.glide.load.model.o<Model, Data> r4) {
            r1 = this;
            com.bumptech.glide.load.model.p r0 = r1.a
            r0.a(r2, r3, r4)
            return r1
    }

    @androidx.annotation.NonNull
    public <Data, TResource> com.bumptech.glide.Registry e(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.Class<Data> r3, @androidx.annotation.NonNull java.lang.Class<TResource> r4, @androidx.annotation.NonNull com.bumptech.glide.load.g<Data, TResource> r5) {
            r1 = this;
            com.bumptech.glide.provider.e r0 = r1.c
            r0.a(r2, r5, r3, r4)
            return r1
    }

    @androidx.annotation.NonNull
    public java.util.List<com.bumptech.glide.load.ImageHeaderParser> g() {
            r2 = this;
            com.bumptech.glide.provider.b r0 = r2.g
            java.util.List r0 = r0.b()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto Ld
            return r0
        Ld:
            com.bumptech.glide.Registry$NoImageHeaderParserException r0 = new com.bumptech.glide.Registry$NoImageHeaderParserException
            r0.<init>()
            throw r0
    }

    @androidx.annotation.Nullable
    public <Data, TResource, Transcode> com.bumptech.glide.load.engine.s<Data, TResource, Transcode> h(@androidx.annotation.NonNull java.lang.Class<Data> r10, @androidx.annotation.NonNull java.lang.Class<TResource> r11, @androidx.annotation.NonNull java.lang.Class<Transcode> r12) {
            r9 = this;
            com.bumptech.glide.provider.c r0 = r9.i
            com.bumptech.glide.load.engine.s r0 = r0.a(r10, r11, r12)
            com.bumptech.glide.provider.c r1 = r9.i
            boolean r1 = r1.c(r0)
            r2 = 0
            if (r1 == 0) goto L10
            return r2
        L10:
            if (r0 != 0) goto L31
            java.util.List r7 = r9.f(r10, r11, r12)
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L20
            r4 = r10
            r5 = r11
            r6 = r12
            goto L2b
        L20:
            com.bumptech.glide.load.engine.s r3 = new com.bumptech.glide.load.engine.s
            androidx.core.util.Pools$Pool<java.util.List<java.lang.Throwable>> r8 = r9.j
            r4 = r10
            r5 = r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            r2 = r3
        L2b:
            com.bumptech.glide.provider.c r10 = r9.i
            r10.d(r4, r5, r6, r2)
            return r2
        L31:
            return r0
    }

    @androidx.annotation.NonNull
    public <Model> java.util.List<com.bumptech.glide.load.model.n<Model, ?>> i(@androidx.annotation.NonNull Model r2) {
            r1 = this;
            com.bumptech.glide.load.model.p r0 = r1.a
            java.util.List r2 = r0.e(r2)
            return r2
    }

    @androidx.annotation.NonNull
    public <Model, TResource, Transcode> java.util.List<java.lang.Class<?>> j(@androidx.annotation.NonNull java.lang.Class<Model> r6, @androidx.annotation.NonNull java.lang.Class<TResource> r7, @androidx.annotation.NonNull java.lang.Class<Transcode> r8) {
            r5 = this;
            com.bumptech.glide.provider.d r0 = r5.h
            java.util.List r0 = r0.b(r6, r7, r8)
            if (r0 != 0) goto L58
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.bumptech.glide.load.model.p r1 = r5.a
            java.util.List r1 = r1.d(r6)
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4f
            java.lang.Object r2 = r1.next()
            java.lang.Class r2 = (java.lang.Class) r2
            com.bumptech.glide.provider.e r3 = r5.c
            java.util.List r2 = r3.d(r2, r7)
            java.util.Iterator r2 = r2.iterator()
        L2d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L17
            java.lang.Object r3 = r2.next()
            java.lang.Class r3 = (java.lang.Class) r3
            com.bumptech.glide.load.resource.transcode.f r4 = r5.f
            java.util.List r4 = r4.b(r3, r8)
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L2d
            boolean r4 = r0.contains(r3)
            if (r4 != 0) goto L2d
            r0.add(r3)
            goto L2d
        L4f:
            com.bumptech.glide.provider.d r1 = r5.h
            java.util.List r2 = java.util.Collections.unmodifiableList(r0)
            r1.c(r6, r7, r8, r2)
        L58:
            return r0
    }

    @androidx.annotation.NonNull
    public <X> com.bumptech.glide.load.h<X> k(@androidx.annotation.NonNull com.bumptech.glide.load.engine.u<X> r3) throws com.bumptech.glide.Registry.NoResultEncoderAvailableException {
            r2 = this;
            com.bumptech.glide.provider.f r0 = r2.d
            java.lang.Class r1 = r3.a()
            com.bumptech.glide.load.h r0 = r0.b(r1)
            if (r0 == 0) goto Ld
            return r0
        Ld:
            com.bumptech.glide.Registry$NoResultEncoderAvailableException r0 = new com.bumptech.glide.Registry$NoResultEncoderAvailableException
            java.lang.Class r3 = r3.a()
            r0.<init>(r3)
            throw r0
    }

    @androidx.annotation.NonNull
    public <X> com.bumptech.glide.load.data.e<X> l(@androidx.annotation.NonNull X r2) {
            r1 = this;
            com.bumptech.glide.load.data.f r0 = r1.e
            com.bumptech.glide.load.data.e r2 = r0.a(r2)
            return r2
    }

    @androidx.annotation.NonNull
    public <X> com.bumptech.glide.load.a<X> m(@androidx.annotation.NonNull X r3) throws com.bumptech.glide.Registry.NoSourceEncoderAvailableException {
            r2 = this;
            com.bumptech.glide.provider.a r0 = r2.b
            java.lang.Class r1 = r3.getClass()
            com.bumptech.glide.load.a r0 = r0.b(r1)
            if (r0 == 0) goto Ld
            return r0
        Ld:
            com.bumptech.glide.Registry$NoSourceEncoderAvailableException r0 = new com.bumptech.glide.Registry$NoSourceEncoderAvailableException
            java.lang.Class r3 = r3.getClass()
            r0.<init>(r3)
            throw r0
    }

    public boolean n(@androidx.annotation.NonNull com.bumptech.glide.load.engine.u<?> r2) {
            r1 = this;
            com.bumptech.glide.provider.f r0 = r1.d
            java.lang.Class r2 = r2.a()
            com.bumptech.glide.load.h r2 = r0.b(r2)
            if (r2 == 0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    @androidx.annotation.NonNull
    public <Data> com.bumptech.glide.Registry o(@androidx.annotation.NonNull java.lang.Class<Data> r2, @androidx.annotation.NonNull com.bumptech.glide.load.a<Data> r3) {
            r1 = this;
            com.bumptech.glide.provider.a r0 = r1.b
            r0.c(r2, r3)
            return r1
    }

    @androidx.annotation.NonNull
    public <TResource> com.bumptech.glide.Registry p(@androidx.annotation.NonNull java.lang.Class<TResource> r2, @androidx.annotation.NonNull com.bumptech.glide.load.h<TResource> r3) {
            r1 = this;
            com.bumptech.glide.provider.f r0 = r1.d
            r0.c(r2, r3)
            return r1
    }

    @androidx.annotation.NonNull
    public <Data, TResource> com.bumptech.glide.Registry q(@androidx.annotation.NonNull java.lang.Class<Data> r2, @androidx.annotation.NonNull java.lang.Class<TResource> r3, @androidx.annotation.NonNull com.bumptech.glide.load.g<Data, TResource> r4) {
            r1 = this;
            java.lang.String r0 = "legacy_prepend_all"
            r1.s(r0, r2, r3, r4)
            return r1
    }

    @androidx.annotation.NonNull
    public <Model, Data> com.bumptech.glide.Registry r(@androidx.annotation.NonNull java.lang.Class<Model> r2, @androidx.annotation.NonNull java.lang.Class<Data> r3, @androidx.annotation.NonNull com.bumptech.glide.load.model.o<Model, Data> r4) {
            r1 = this;
            com.bumptech.glide.load.model.p r0 = r1.a
            r0.g(r2, r3, r4)
            return r1
    }

    @androidx.annotation.NonNull
    public <Data, TResource> com.bumptech.glide.Registry s(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.Class<Data> r3, @androidx.annotation.NonNull java.lang.Class<TResource> r4, @androidx.annotation.NonNull com.bumptech.glide.load.g<Data, TResource> r5) {
            r1 = this;
            com.bumptech.glide.provider.e r0 = r1.c
            r0.e(r2, r5, r3, r4)
            return r1
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.Registry t(@androidx.annotation.NonNull com.bumptech.glide.load.ImageHeaderParser r2) {
            r1 = this;
            com.bumptech.glide.provider.b r0 = r1.g
            r0.a(r2)
            return r1
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.Registry u(@androidx.annotation.NonNull com.bumptech.glide.load.data.e.a<?> r2) {
            r1 = this;
            com.bumptech.glide.load.data.f r0 = r1.e
            r0.b(r2)
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public <Data> com.bumptech.glide.Registry v(@androidx.annotation.NonNull java.lang.Class<Data> r1, @androidx.annotation.NonNull com.bumptech.glide.load.a<Data> r2) {
            r0 = this;
            com.bumptech.glide.Registry r1 = r0.a(r1, r2)
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public <TResource> com.bumptech.glide.Registry w(@androidx.annotation.NonNull java.lang.Class<TResource> r1, @androidx.annotation.NonNull com.bumptech.glide.load.h<TResource> r2) {
            r0 = this;
            com.bumptech.glide.Registry r1 = r0.b(r1, r2)
            return r1
    }

    @androidx.annotation.NonNull
    public <TResource, Transcode> com.bumptech.glide.Registry x(@androidx.annotation.NonNull java.lang.Class<TResource> r2, @androidx.annotation.NonNull java.lang.Class<Transcode> r3, @androidx.annotation.NonNull com.bumptech.glide.load.resource.transcode.e<TResource, Transcode> r4) {
            r1 = this;
            com.bumptech.glide.load.resource.transcode.f r0 = r1.f
            r0.c(r2, r3, r4)
            return r1
    }

    @androidx.annotation.NonNull
    public <Model, Data> com.bumptech.glide.Registry y(@androidx.annotation.NonNull java.lang.Class<Model> r2, @androidx.annotation.NonNull java.lang.Class<Data> r3, @androidx.annotation.NonNull com.bumptech.glide.load.model.o<? extends Model, ? extends Data> r4) {
            r1 = this;
            com.bumptech.glide.load.model.p r0 = r1.a
            r0.i(r2, r3, r4)
            return r1
    }

    @androidx.annotation.NonNull
    public final com.bumptech.glide.Registry z(@androidx.annotation.NonNull java.util.List<java.lang.String> r3) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.size()
            r0.<init>(r1)
            java.lang.String r1 = "legacy_prepend_all"
            r0.add(r1)
            java.util.Iterator r3 = r3.iterator()
        L12:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            r0.add(r1)
            goto L12
        L22:
            java.lang.String r3 = "legacy_append"
            r0.add(r3)
            com.bumptech.glide.provider.e r3 = r2.c
            r3.f(r0)
            return r2
    }
}
