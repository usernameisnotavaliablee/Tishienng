package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class bs {
    private static final java.util.Comparator a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.analytics.pro.bs$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a implements java.util.Comparator {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ a(com.umeng.analytics.pro.bs.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public int compare(java.lang.Object r2, java.lang.Object r3) {
                r1 = this;
                if (r2 != 0) goto L6
                if (r3 != 0) goto L6
                r2 = 0
                return r2
            L6:
                if (r2 != 0) goto La
                r2 = -1
                return r2
            La:
                if (r3 != 0) goto Le
                r2 = 1
                return r2
            Le:
                boolean r0 = r2 instanceof java.util.List
                if (r0 == 0) goto L1b
                java.util.List r2 = (java.util.List) r2
                java.util.List r3 = (java.util.List) r3
                int r2 = com.umeng.analytics.pro.bs.a(r2, r3)
                return r2
            L1b:
                boolean r0 = r2 instanceof java.util.Set
                if (r0 == 0) goto L28
                java.util.Set r2 = (java.util.Set) r2
                java.util.Set r3 = (java.util.Set) r3
                int r2 = com.umeng.analytics.pro.bs.a(r2, r3)
                return r2
            L28:
                boolean r0 = r2 instanceof java.util.Map
                if (r0 == 0) goto L35
                java.util.Map r2 = (java.util.Map) r2
                java.util.Map r3 = (java.util.Map) r3
                int r2 = com.umeng.analytics.pro.bs.a(r2, r3)
                return r2
            L35:
                boolean r0 = r2 instanceof byte[]
                if (r0 == 0) goto L42
                byte[] r2 = (byte[]) r2
                byte[] r3 = (byte[]) r3
                int r2 = com.umeng.analytics.pro.bs.a(r2, r3)
                return r2
            L42:
                java.lang.Comparable r2 = (java.lang.Comparable) r2
                java.lang.Comparable r3 = (java.lang.Comparable) r3
                int r2 = com.umeng.analytics.pro.bs.a(r2, r3)
                return r2
        }
    }

    static {
            com.umeng.analytics.pro.bs$a r0 = new com.umeng.analytics.pro.bs$a
            r1 = 0
            r0.<init>(r1)
            com.umeng.analytics.pro.bs.a = r0
            return
    }

    private bs() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int a(byte r0, byte r1) {
            if (r0 >= r1) goto L4
            r0 = -1
            return r0
        L4:
            if (r1 >= r0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static int a(double r1, double r3) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L6
            r1 = -1
            return r1
        L6:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    public static int a(int r0, int r1) {
            if (r0 >= r1) goto L4
            r0 = -1
            return r0
        L4:
            if (r1 >= r0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static int a(long r1, long r3) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L6
            r1 = -1
            return r1
        L6:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    public static int a(java.lang.Comparable r0, java.lang.Comparable r1) {
            int r0 = r0.compareTo(r1)
            return r0
    }

    public static int a(java.lang.Object r2, java.lang.Object r3) {
            boolean r0 = r2 instanceof java.lang.Comparable
            if (r0 == 0) goto Ld
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r2 = a(r2, r3)
            return r2
        Ld:
            boolean r0 = r2 instanceof java.util.List
            if (r0 == 0) goto L1a
            java.util.List r2 = (java.util.List) r2
            java.util.List r3 = (java.util.List) r3
            int r2 = a(r2, r3)
            return r2
        L1a:
            boolean r0 = r2 instanceof java.util.Set
            if (r0 == 0) goto L27
            java.util.Set r2 = (java.util.Set) r2
            java.util.Set r3 = (java.util.Set) r3
            int r2 = a(r2, r3)
            return r2
        L27:
            boolean r0 = r2 instanceof java.util.Map
            if (r0 == 0) goto L34
            java.util.Map r2 = (java.util.Map) r2
            java.util.Map r3 = (java.util.Map) r3
            int r2 = a(r2, r3)
            return r2
        L34:
            boolean r0 = r2 instanceof byte[]
            if (r0 == 0) goto L41
            byte[] r2 = (byte[]) r2
            byte[] r3 = (byte[]) r3
            int r2 = a(r2, r3)
            return r2
        L41:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot compare objects of type "
            r0.append(r1)
            java.lang.Class r2 = r2.getClass()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }

    public static int a(java.lang.String r0, java.lang.String r1) {
            int r0 = r0.compareTo(r1)
            return r0
    }

    public static int a(java.nio.ByteBuffer r3, byte[] r4, int r5) {
            int r0 = r3.remaining()
            byte[] r1 = r3.array()
            int r2 = r3.arrayOffset()
            int r3 = r3.position()
            int r2 = r2 + r3
            java.lang.System.arraycopy(r1, r2, r4, r5, r0)
            return r0
    }

    public static int a(java.util.List r5, java.util.List r6) {
            int r0 = r5.size()
            int r1 = r6.size()
            int r0 = a(r0, r1)
            if (r0 == 0) goto Lf
            return r0
        Lf:
            r0 = 0
            r1 = 0
        L11:
            int r2 = r5.size()
            if (r1 >= r2) goto L2b
            java.util.Comparator r2 = com.umeng.analytics.pro.bs.a
            java.lang.Object r3 = r5.get(r1)
            java.lang.Object r4 = r6.get(r1)
            int r2 = r2.compare(r3, r4)
            if (r2 == 0) goto L28
            return r2
        L28:
            int r1 = r1 + 1
            goto L11
        L2b:
            return r0
    }

    public static int a(java.util.Map r5, java.util.Map r6) {
            int r0 = r5.size()
            int r1 = r6.size()
            int r0 = a(r0, r1)
            if (r0 == 0) goto Lf
            return r0
        Lf:
            java.util.TreeMap r0 = new java.util.TreeMap
            java.util.Comparator r1 = com.umeng.analytics.pro.bs.a
            r0.<init>(r1)
            r0.putAll(r5)
            java.util.Set r5 = r0.entrySet()
            java.util.Iterator r5 = r5.iterator()
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>(r1)
            r0.putAll(r6)
            java.util.Set r6 = r0.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L31:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L69
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L69
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r6.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.util.Comparator r2 = com.umeng.analytics.pro.bs.a
            java.lang.Object r3 = r0.getKey()
            java.lang.Object r4 = r1.getKey()
            int r3 = r2.compare(r3, r4)
            if (r3 == 0) goto L5a
            return r3
        L5a:
            java.lang.Object r0 = r0.getValue()
            java.lang.Object r1 = r1.getValue()
            int r0 = r2.compare(r0, r1)
            if (r0 == 0) goto L31
            return r0
        L69:
            r5 = 0
            return r5
    }

    public static int a(java.util.Set r3, java.util.Set r4) {
            int r0 = r3.size()
            int r1 = r4.size()
            int r0 = a(r0, r1)
            if (r0 == 0) goto Lf
            return r0
        Lf:
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Comparator r1 = com.umeng.analytics.pro.bs.a
            r0.<init>(r1)
            r0.addAll(r3)
            java.util.TreeSet r3 = new java.util.TreeSet
            r3.<init>(r1)
            r3.addAll(r4)
            java.util.Iterator r4 = r0.iterator()
            java.util.Iterator r3 = r3.iterator()
        L29:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L46
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L46
            java.util.Comparator r0 = com.umeng.analytics.pro.bs.a
            java.lang.Object r1 = r4.next()
            java.lang.Object r2 = r3.next()
            int r0 = r0.compare(r1, r2)
            if (r0 == 0) goto L29
            return r0
        L46:
            r3 = 0
            return r3
    }

    public static int a(short r0, short r1) {
            if (r0 >= r1) goto L4
            r0 = -1
            return r0
        L4:
            if (r1 >= r0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static int a(boolean r0, boolean r1) {
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            return r0
    }

    public static int a(byte[] r4, byte[] r5) {
            int r0 = r4.length
            int r1 = r5.length
            int r0 = a(r0, r1)
            if (r0 == 0) goto L9
            return r0
        L9:
            r0 = 0
            r1 = 0
        Lb:
            int r2 = r4.length
            if (r1 >= r2) goto L1c
            r2 = r4[r1]
            r3 = r5[r1]
            int r2 = a(r2, r3)
            if (r2 == 0) goto L19
            return r2
        L19:
            int r1 = r1 + 1
            goto Lb
        L1c:
            return r0
    }

    public static java.lang.String a(byte r1) {
            r1 = r1 | 256(0x100, float:3.59E-43)
            r1 = r1 & 511(0x1ff, float:7.16E-43)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            java.lang.String r1 = r1.toUpperCase()
            r0 = 1
            java.lang.String r1 = r1.substring(r0)
            return r1
    }

    public static void a(java.nio.ByteBuffer r5, java.lang.StringBuilder r6) {
            byte[] r0 = r5.array()
            int r1 = r5.arrayOffset()
            int r2 = r5.position()
            int r2 = r2 + r1
            int r5 = r5.limit()
            int r1 = r1 + r5
            int r5 = r1 - r2
            r3 = 128(0x80, float:1.8E-43)
            if (r5 <= r3) goto L1b
            int r5 = r2 + 128
            goto L1c
        L1b:
            r5 = r1
        L1c:
            r3 = r2
        L1d:
            if (r3 >= r5) goto L32
            if (r3 <= r2) goto L26
            java.lang.String r4 = " "
            r6.append(r4)
        L26:
            r4 = r0[r3]
            java.lang.String r4 = a(r4)
            r6.append(r4)
            int r3 = r3 + 1
            goto L1d
        L32:
            if (r1 == r5) goto L39
            java.lang.String r5 = "..."
            r6.append(r5)
        L39:
            return
    }

    public static byte[] a(java.nio.ByteBuffer r2) {
            boolean r0 = b(r2)
            if (r0 == 0) goto Lb
            byte[] r2 = r2.array()
            return r2
        Lb:
            int r0 = r2.remaining()
            byte[] r0 = new byte[r0]
            r1 = 0
            a(r2, r0, r1)
            return r0
    }

    public static byte[] a(byte[] r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r3.length
            byte[] r0 = new byte[r0]
            int r1 = r3.length
            r2 = 0
            java.lang.System.arraycopy(r3, r2, r0, r2, r1)
            return r0
    }

    public static boolean b(java.nio.ByteBuffer r1) {
            boolean r0 = r1.hasArray()
            if (r0 == 0) goto L1e
            int r0 = r1.position()
            if (r0 != 0) goto L1e
            int r0 = r1.arrayOffset()
            if (r0 != 0) goto L1e
            int r0 = r1.remaining()
            int r1 = r1.capacity()
            if (r0 != r1) goto L1e
            r1 = 1
            return r1
        L1e:
            r1 = 0
            return r1
    }

    public static java.nio.ByteBuffer c(java.nio.ByteBuffer r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            boolean r0 = b(r1)
            if (r0 == 0) goto Lb
            return r1
        Lb:
            byte[] r1 = a(r1)
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
            return r1
    }

    public static java.nio.ByteBuffer d(java.nio.ByteBuffer r5) {
            if (r5 != 0) goto L4
            r5 = 0
            return r5
        L4:
            int r0 = r5.remaining()
            byte[] r0 = new byte[r0]
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            boolean r1 = r5.hasArray()
            if (r1 == 0) goto L2e
            byte[] r1 = r5.array()
            int r2 = r5.arrayOffset()
            int r3 = r5.position()
            int r2 = r2 + r3
            byte[] r3 = r0.array()
            r4 = 0
            int r5 = r5.remaining()
            java.lang.System.arraycopy(r1, r2, r3, r4, r5)
            return r0
        L2e:
            java.nio.ByteBuffer r5 = r5.slice()
            byte[] r1 = r0.array()
            r5.get(r1)
            return r0
    }
}
