package kotlin.reflect.jvm.internal.impl.protobuf;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class k extends java.util.AbstractList<java.lang.String> implements java.util.RandomAccess, kotlin.reflect.jvm.internal.impl.protobuf.l {
    public static final kotlin.reflect.jvm.internal.impl.protobuf.l b = null;
    private final java.util.List<java.lang.Object> a;

    static {
            kotlin.reflect.jvm.internal.impl.protobuf.k r0 = new kotlin.reflect.jvm.internal.impl.protobuf.k
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.protobuf.l r0 = r0.c()
            kotlin.reflect.jvm.internal.impl.protobuf.k.b = r0
            return
    }

    public k() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
            return
    }

    public k(kotlin.reflect.jvm.internal.impl.protobuf.l r3) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.size()
            r0.<init>(r1)
            r2.a = r0
            r2.addAll(r3)
            return
    }

    private static kotlin.reflect.jvm.internal.impl.protobuf.d d(java.lang.Object r1) {
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.protobuf.d
            if (r0 == 0) goto L7
            kotlin.reflect.jvm.internal.impl.protobuf.d r1 = (kotlin.reflect.jvm.internal.impl.protobuf.d) r1
            return r1
        L7:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L12
            java.lang.String r1 = (java.lang.String) r1
            kotlin.reflect.jvm.internal.impl.protobuf.d r1 = kotlin.reflect.jvm.internal.impl.protobuf.d.j(r1)
            return r1
        L12:
            byte[] r1 = (byte[]) r1
            kotlin.reflect.jvm.internal.impl.protobuf.d r1 = kotlin.reflect.jvm.internal.impl.protobuf.d.f(r1)
            return r1
    }

    private static java.lang.String e(java.lang.Object r1) {
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L7
            java.lang.String r1 = (java.lang.String) r1
            return r1
        L7:
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.protobuf.d
            if (r0 == 0) goto L12
            kotlin.reflect.jvm.internal.impl.protobuf.d r1 = (kotlin.reflect.jvm.internal.impl.protobuf.d) r1
            java.lang.String r1 = r1.z()
            return r1
        L12:
            byte[] r1 = (byte[]) r1
            java.lang.String r1 = kotlin.reflect.jvm.internal.impl.protobuf.h.b(r1)
            return r1
    }

    public void a(int r2, java.lang.String r3) {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.a
            r0.add(r2, r3)
            int r2 = r1.modCount
            int r2 = r2 + 1
            r1.modCount = r2
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ void add(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.String r2 = (java.lang.String) r2
            r0.a(r1, r2)
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int r2, java.util.Collection<? extends java.lang.String> r3) {
            r1 = this;
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.l
            if (r0 == 0) goto La
            kotlin.reflect.jvm.internal.impl.protobuf.l r3 = (kotlin.reflect.jvm.internal.impl.protobuf.l) r3
            java.util.List r3 = r3.h()
        La:
            java.util.List<java.lang.Object> r0 = r1.a
            boolean r2 = r0.addAll(r2, r3)
            int r3 = r1.modCount
            int r3 = r3 + 1
            r1.modCount = r3
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection<? extends java.lang.String> r2) {
            r1 = this;
            int r0 = r1.size()
            boolean r2 = r1.addAll(r0, r2)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.l
    public kotlin.reflect.jvm.internal.impl.protobuf.l c() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.t r0 = new kotlin.reflect.jvm.internal.impl.protobuf.t
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.a
            r0.clear()
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            return
    }

    public java.lang.String f(int r3) {
            r2 = this;
            java.util.List<java.lang.Object> r0 = r2.a
            java.lang.Object r0 = r0.get(r3)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto Ld
            java.lang.String r0 = (java.lang.String) r0
            return r0
        Ld:
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.protobuf.d
            if (r1 == 0) goto L23
            kotlin.reflect.jvm.internal.impl.protobuf.d r0 = (kotlin.reflect.jvm.internal.impl.protobuf.d) r0
            java.lang.String r1 = r0.z()
            boolean r0 = r0.q()
            if (r0 == 0) goto L22
            java.util.List<java.lang.Object> r0 = r2.a
            r0.set(r3, r1)
        L22:
            return r1
        L23:
            byte[] r0 = (byte[]) r0
            java.lang.String r1 = kotlin.reflect.jvm.internal.impl.protobuf.h.b(r0)
            boolean r0 = kotlin.reflect.jvm.internal.impl.protobuf.h.a(r0)
            if (r0 == 0) goto L34
            java.util.List<java.lang.Object> r0 = r2.a
            r0.set(r3, r1)
        L34:
            return r1
    }

    public java.lang.String g(int r2) {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.a
            java.lang.Object r2 = r0.remove(r2)
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            java.lang.String r2 = e(r2)
            return r2
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
            r0 = this;
            java.lang.String r1 = r0.f(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.l
    public java.util.List<?> h() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.a
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.l
    public kotlin.reflect.jvm.internal.impl.protobuf.d i(int r3) {
            r2 = this;
            java.util.List<java.lang.Object> r0 = r2.a
            java.lang.Object r0 = r0.get(r3)
            kotlin.reflect.jvm.internal.impl.protobuf.d r1 = d(r0)
            if (r1 == r0) goto L11
            java.util.List<java.lang.Object> r0 = r2.a
            r0.set(r3, r1)
        L11:
            return r1
    }

    public java.lang.String j(int r2, java.lang.String r3) {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.a
            java.lang.Object r2 = r0.set(r2, r3)
            java.lang.String r2 = e(r2)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.l
    public void k(kotlin.reflect.jvm.internal.impl.protobuf.d r2) {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.a
            r0.add(r2)
            int r2 = r1.modCount
            int r2 = r2 + 1
            r1.modCount = r2
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object remove(int r1) {
            r0 = this;
            java.lang.String r1 = r0.g(r1)
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object set(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r1 = r0.j(r1, r2)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.a
            int r0 = r0.size()
            return r0
    }
}
