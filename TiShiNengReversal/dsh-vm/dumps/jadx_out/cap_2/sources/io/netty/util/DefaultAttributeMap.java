package io.netty.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class DefaultAttributeMap implements io.netty.util.AttributeMap {
    private static final int BUCKET_SIZE = 4;
    private static final int MASK = 3;
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<io.netty.util.DefaultAttributeMap, java.util.concurrent.atomic.AtomicReferenceArray> updater = null;
    private volatile java.util.concurrent.atomic.AtomicReferenceArray<io.netty.util.DefaultAttributeMap.DefaultAttribute<?>> attributes;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class DefaultAttribute<T> extends java.util.concurrent.atomic.AtomicReference<T> implements io.netty.util.Attribute<T> {
        private static final long serialVersionUID = -2661411462200283011L;
        private final io.netty.util.DefaultAttributeMap.DefaultAttribute<?> head;
        private final io.netty.util.AttributeKey<T> key;
        private io.netty.util.DefaultAttributeMap.DefaultAttribute<?> next;
        private io.netty.util.DefaultAttributeMap.DefaultAttribute<?> prev;
        private volatile boolean removed;

        DefaultAttribute() {
                r1 = this;
                r1.<init>()
                r1.head = r1
                r0 = 0
                r1.key = r0
                return
        }

        DefaultAttribute(io.netty.util.DefaultAttributeMap.DefaultAttribute<?> r1, io.netty.util.AttributeKey<T> r2) {
                r0 = this;
                r0.<init>()
                r0.head = r1
                r0.key = r2
                return
        }

        static /* synthetic */ io.netty.util.DefaultAttributeMap.DefaultAttribute access$000(io.netty.util.DefaultAttributeMap.DefaultAttribute r0) {
                io.netty.util.DefaultAttributeMap$DefaultAttribute<?> r0 = r0.next
                return r0
        }

        static /* synthetic */ io.netty.util.DefaultAttributeMap.DefaultAttribute access$002(io.netty.util.DefaultAttributeMap.DefaultAttribute r0, io.netty.util.DefaultAttributeMap.DefaultAttribute r1) {
                r0.next = r1
                return r1
        }

        static /* synthetic */ io.netty.util.DefaultAttributeMap.DefaultAttribute access$102(io.netty.util.DefaultAttributeMap.DefaultAttribute r0, io.netty.util.DefaultAttributeMap.DefaultAttribute r1) {
                r0.prev = r1
                return r1
        }

        static /* synthetic */ io.netty.util.AttributeKey access$200(io.netty.util.DefaultAttributeMap.DefaultAttribute r0) {
                io.netty.util.AttributeKey<T> r0 = r0.key
                return r0
        }

        static /* synthetic */ boolean access$300(io.netty.util.DefaultAttributeMap.DefaultAttribute r0) {
                boolean r0 = r0.removed
                return r0
        }

        private void remove0() {
                r3 = this;
                io.netty.util.DefaultAttributeMap$DefaultAttribute<?> r0 = r3.head
                monitor-enter(r0)
                io.netty.util.DefaultAttributeMap$DefaultAttribute<?> r1 = r3.prev     // Catch: java.lang.Throwable -> L9
                if (r1 != 0) goto Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
                return
            L9:
                r1 = move-exception
                goto L1c
            Lb:
                io.netty.util.DefaultAttributeMap$DefaultAttribute<?> r2 = r3.next     // Catch: java.lang.Throwable -> L9
                r1.next = r2     // Catch: java.lang.Throwable -> L9
                io.netty.util.DefaultAttributeMap$DefaultAttribute<?> r2 = r3.next     // Catch: java.lang.Throwable -> L9
                if (r2 == 0) goto L15
                r2.prev = r1     // Catch: java.lang.Throwable -> L9
            L15:
                r1 = 0
                r3.prev = r1     // Catch: java.lang.Throwable -> L9
                r3.next = r1     // Catch: java.lang.Throwable -> L9
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
                return
            L1c:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
                throw r1
        }

        @Override // io.netty.util.Attribute
        public T getAndRemove() {
                r1 = this;
                r0 = 1
                r1.removed = r0
                r0 = 0
                java.lang.Object r0 = r1.getAndSet(r0)
                r1.remove0()
                return r0
        }

        @Override // io.netty.util.Attribute
        public io.netty.util.AttributeKey<T> key() {
                r1 = this;
                io.netty.util.AttributeKey<T> r0 = r1.key
                return r0
        }

        @Override // io.netty.util.Attribute
        public void remove() {
                r1 = this;
                r0 = 1
                r1.removed = r0
                r0 = 0
                r1.set(r0)
                r1.remove0()
                return
        }

        @Override // io.netty.util.Attribute
        public T setIfAbsent(T r3) {
                r2 = this;
            L0:
                r0 = 0
                boolean r1 = r2.compareAndSet(r0, r3)
                if (r1 != 0) goto Ld
                java.lang.Object r0 = r2.get()
                if (r0 == 0) goto L0
            Ld:
                return r0
        }
    }

    static {
            java.lang.Class<java.util.concurrent.atomic.AtomicReferenceArray> r0 = java.util.concurrent.atomic.AtomicReferenceArray.class
            java.lang.String r1 = "attributes"
            java.lang.Class<io.netty.util.DefaultAttributeMap> r2 = io.netty.util.DefaultAttributeMap.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            io.netty.util.DefaultAttributeMap.updater = r0
            return
    }

    public DefaultAttributeMap() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int index(io.netty.util.AttributeKey<?> r0) {
            int r0 = r0.id()
            r0 = r0 & 3
            return r0
    }

    @Override // io.netty.util.AttributeMap
    public <T> io.netty.util.Attribute<T> attr(io.netty.util.AttributeKey<T> r6) {
            r5 = this;
            if (r6 == 0) goto L6a
            java.util.concurrent.atomic.AtomicReferenceArray<io.netty.util.DefaultAttributeMap$DefaultAttribute<?>> r0 = r5.attributes
            r1 = 0
            if (r0 != 0) goto L17
            java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
            r2 = 4
            r0.<init>(r2)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<io.netty.util.DefaultAttributeMap, java.util.concurrent.atomic.AtomicReferenceArray> r2 = io.netty.util.DefaultAttributeMap.updater
            boolean r2 = androidx.concurrent.futures.a.a(r2, r5, r1, r0)
            if (r2 != 0) goto L17
            java.util.concurrent.atomic.AtomicReferenceArray<io.netty.util.DefaultAttributeMap$DefaultAttribute<?>> r0 = r5.attributes
        L17:
            int r2 = index(r6)
            java.lang.Object r3 = r0.get(r2)
            io.netty.util.DefaultAttributeMap$DefaultAttribute r3 = (io.netty.util.DefaultAttributeMap.DefaultAttribute) r3
            if (r3 != 0) goto L41
            io.netty.util.DefaultAttributeMap$DefaultAttribute r3 = new io.netty.util.DefaultAttributeMap$DefaultAttribute
            r3.<init>()
            io.netty.util.DefaultAttributeMap$DefaultAttribute r4 = new io.netty.util.DefaultAttributeMap$DefaultAttribute
            r4.<init>(r3, r6)
            io.netty.util.DefaultAttributeMap.DefaultAttribute.access$002(r3, r4)
            io.netty.util.DefaultAttributeMap.DefaultAttribute.access$102(r4, r3)
            boolean r1 = com.google.common.util.concurrent.b.a(r0, r2, r1, r3)
            if (r1 == 0) goto L3a
            return r4
        L3a:
            java.lang.Object r0 = r0.get(r2)
            r3 = r0
            io.netty.util.DefaultAttributeMap$DefaultAttribute r3 = (io.netty.util.DefaultAttributeMap.DefaultAttribute) r3
        L41:
            monitor-enter(r3)
            r0 = r3
        L43:
            io.netty.util.DefaultAttributeMap$DefaultAttribute r1 = io.netty.util.DefaultAttributeMap.DefaultAttribute.access$000(r0)     // Catch: java.lang.Throwable -> L56
            if (r1 != 0) goto L58
            io.netty.util.DefaultAttributeMap$DefaultAttribute r1 = new io.netty.util.DefaultAttributeMap$DefaultAttribute     // Catch: java.lang.Throwable -> L56
            r1.<init>(r3, r6)     // Catch: java.lang.Throwable -> L56
            io.netty.util.DefaultAttributeMap.DefaultAttribute.access$002(r0, r1)     // Catch: java.lang.Throwable -> L56
            io.netty.util.DefaultAttributeMap.DefaultAttribute.access$102(r1, r0)     // Catch: java.lang.Throwable -> L56
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L56
            return r1
        L56:
            r6 = move-exception
            goto L68
        L58:
            io.netty.util.AttributeKey r0 = io.netty.util.DefaultAttributeMap.DefaultAttribute.access$200(r1)     // Catch: java.lang.Throwable -> L56
            if (r0 != r6) goto L66
            boolean r0 = io.netty.util.DefaultAttributeMap.DefaultAttribute.access$300(r1)     // Catch: java.lang.Throwable -> L56
            if (r0 != 0) goto L66
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L56
            return r1
        L66:
            r0 = r1
            goto L43
        L68:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L56
            throw r6
        L6a:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "key"
            r6.<init>(r0)
            throw r6
    }

    @Override // io.netty.util.AttributeMap
    public <T> boolean hasAttr(io.netty.util.AttributeKey<T> r5) {
            r4 = this;
            if (r5 == 0) goto L36
            java.util.concurrent.atomic.AtomicReferenceArray<io.netty.util.DefaultAttributeMap$DefaultAttribute<?>> r0 = r4.attributes
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r2 = index(r5)
            java.lang.Object r0 = r0.get(r2)
            io.netty.util.DefaultAttributeMap$DefaultAttribute r0 = (io.netty.util.DefaultAttributeMap.DefaultAttribute) r0
            if (r0 != 0) goto L15
            return r1
        L15:
            monitor-enter(r0)
            io.netty.util.DefaultAttributeMap$DefaultAttribute r2 = io.netty.util.DefaultAttributeMap.DefaultAttribute.access$000(r0)     // Catch: java.lang.Throwable -> L2b
        L1a:
            if (r2 == 0) goto L32
            io.netty.util.AttributeKey r3 = io.netty.util.DefaultAttributeMap.DefaultAttribute.access$200(r2)     // Catch: java.lang.Throwable -> L2b
            if (r3 != r5) goto L2d
            boolean r3 = io.netty.util.DefaultAttributeMap.DefaultAttribute.access$300(r2)     // Catch: java.lang.Throwable -> L2b
            if (r3 != 0) goto L2d
            r5 = 1
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            return r5
        L2b:
            r5 = move-exception
            goto L34
        L2d:
            io.netty.util.DefaultAttributeMap$DefaultAttribute r2 = io.netty.util.DefaultAttributeMap.DefaultAttribute.access$000(r2)     // Catch: java.lang.Throwable -> L2b
            goto L1a
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            return r1
        L34:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r5
        L36:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "key"
            r5.<init>(r0)
            throw r5
    }
}
