package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class HttpMethod implements java.lang.Comparable<io.netty.handler.codec.http.HttpMethod> {
    public static final io.netty.handler.codec.http.HttpMethod CONNECT = null;
    public static final io.netty.handler.codec.http.HttpMethod DELETE = null;
    public static final io.netty.handler.codec.http.HttpMethod GET = null;
    public static final io.netty.handler.codec.http.HttpMethod HEAD = null;
    public static final io.netty.handler.codec.http.HttpMethod OPTIONS = null;
    public static final io.netty.handler.codec.http.HttpMethod PATCH = null;
    public static final io.netty.handler.codec.http.HttpMethod POST = null;
    public static final io.netty.handler.codec.http.HttpMethod PUT = null;
    public static final io.netty.handler.codec.http.HttpMethod TRACE = null;
    private static final io.netty.handler.codec.http.HttpMethod.EnumNameMap<io.netty.handler.codec.http.HttpMethod> methodMap = null;
    private final io.netty.util.AsciiString name;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class EnumNameMap<T> {
        private final io.netty.handler.codec.http.HttpMethod.EnumNameMap.Node<T>[] values;
        private final int valuesMask;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private static final class Node<T> {
            final java.lang.String key;
            final T value;

            Node(java.lang.String r1, T r2) {
                    r0 = this;
                    r0.<init>()
                    r0.key = r1
                    r0.value = r2
                    return
            }
        }

        EnumNameMap(io.netty.handler.codec.http.HttpMethod.EnumNameMap.Node<T>... r7) {
                r6 = this;
                r6.<init>()
                int r0 = r7.length
                int r0 = io.netty.util.internal.MathUtil.findNextPositivePowerOfTwo(r0)
                io.netty.handler.codec.http.HttpMethod$EnumNameMap$Node[] r0 = new io.netty.handler.codec.http.HttpMethod.EnumNameMap.Node[r0]
                r6.values = r0
                int r0 = r0.length
                int r0 = r0 + (-1)
                r6.valuesMask = r0
                int r0 = r7.length
                r1 = 0
            L13:
                if (r1 >= r0) goto L5f
                r2 = r7[r1]
                java.lang.String r3 = r2.key
                int r3 = hashCode(r3)
                int r4 = r6.valuesMask
                r3 = r3 & r4
                io.netty.handler.codec.http.HttpMethod$EnumNameMap$Node<T>[] r4 = r6.values
                r5 = r4[r3]
                if (r5 != 0) goto L2b
                r4[r3] = r2
                int r1 = r1 + 1
                goto L13
            L2b:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "index "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = " collision between values: ["
                r0.append(r1)
                io.netty.handler.codec.http.HttpMethod$EnumNameMap$Node<T>[] r1 = r6.values
                r1 = r1[r3]
                java.lang.String r1 = r1.key
                r0.append(r1)
                java.lang.String r1 = ", "
                r0.append(r1)
                java.lang.String r1 = r2.key
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r7.<init>(r0)
                throw r7
            L5f:
                return
        }

        private static int hashCode(java.lang.String r0) {
                int r0 = r0.hashCode()
                int r0 = r0 >>> 6
                return r0
        }

        T get(java.lang.String r4) {
                r3 = this;
                io.netty.handler.codec.http.HttpMethod$EnumNameMap$Node<T>[] r0 = r3.values
                int r1 = hashCode(r4)
                int r2 = r3.valuesMask
                r1 = r1 & r2
                r0 = r0[r1]
                if (r0 == 0) goto L19
                java.lang.String r1 = r0.key
                boolean r4 = r1.equals(r4)
                if (r4 != 0) goto L16
                goto L19
            L16:
                T r4 = r0.value
                return r4
            L19:
                r4 = 0
                return r4
        }
    }

    static {
            io.netty.handler.codec.http.HttpMethod r0 = new io.netty.handler.codec.http.HttpMethod
            java.lang.String r1 = "OPTIONS"
            r0.<init>(r1)
            io.netty.handler.codec.http.HttpMethod.OPTIONS = r0
            io.netty.handler.codec.http.HttpMethod r1 = new io.netty.handler.codec.http.HttpMethod
            java.lang.String r2 = "GET"
            r1.<init>(r2)
            io.netty.handler.codec.http.HttpMethod.GET = r1
            io.netty.handler.codec.http.HttpMethod r2 = new io.netty.handler.codec.http.HttpMethod
            java.lang.String r3 = "HEAD"
            r2.<init>(r3)
            io.netty.handler.codec.http.HttpMethod.HEAD = r2
            io.netty.handler.codec.http.HttpMethod r3 = new io.netty.handler.codec.http.HttpMethod
            java.lang.String r4 = "POST"
            r3.<init>(r4)
            io.netty.handler.codec.http.HttpMethod.POST = r3
            io.netty.handler.codec.http.HttpMethod r4 = new io.netty.handler.codec.http.HttpMethod
            java.lang.String r5 = "PUT"
            r4.<init>(r5)
            io.netty.handler.codec.http.HttpMethod.PUT = r4
            io.netty.handler.codec.http.HttpMethod r5 = new io.netty.handler.codec.http.HttpMethod
            java.lang.String r6 = "PATCH"
            r5.<init>(r6)
            io.netty.handler.codec.http.HttpMethod.PATCH = r5
            io.netty.handler.codec.http.HttpMethod r6 = new io.netty.handler.codec.http.HttpMethod
            java.lang.String r7 = "DELETE"
            r6.<init>(r7)
            io.netty.handler.codec.http.HttpMethod.DELETE = r6
            io.netty.handler.codec.http.HttpMethod r7 = new io.netty.handler.codec.http.HttpMethod
            java.lang.String r8 = "TRACE"
            r7.<init>(r8)
            io.netty.handler.codec.http.HttpMethod.TRACE = r7
            io.netty.handler.codec.http.HttpMethod r8 = new io.netty.handler.codec.http.HttpMethod
            java.lang.String r9 = "CONNECT"
            r8.<init>(r9)
            io.netty.handler.codec.http.HttpMethod.CONNECT = r8
            io.netty.handler.codec.http.HttpMethod$EnumNameMap r9 = new io.netty.handler.codec.http.HttpMethod$EnumNameMap
            io.netty.handler.codec.http.HttpMethod$EnumNameMap$Node r10 = new io.netty.handler.codec.http.HttpMethod$EnumNameMap$Node
            java.lang.String r11 = r0.toString()
            r10.<init>(r11, r0)
            io.netty.handler.codec.http.HttpMethod$EnumNameMap$Node r0 = new io.netty.handler.codec.http.HttpMethod$EnumNameMap$Node
            java.lang.String r11 = r1.toString()
            r0.<init>(r11, r1)
            io.netty.handler.codec.http.HttpMethod$EnumNameMap$Node r1 = new io.netty.handler.codec.http.HttpMethod$EnumNameMap$Node
            java.lang.String r11 = r2.toString()
            r1.<init>(r11, r2)
            io.netty.handler.codec.http.HttpMethod$EnumNameMap$Node r2 = new io.netty.handler.codec.http.HttpMethod$EnumNameMap$Node
            java.lang.String r11 = r3.toString()
            r2.<init>(r11, r3)
            io.netty.handler.codec.http.HttpMethod$EnumNameMap$Node r3 = new io.netty.handler.codec.http.HttpMethod$EnumNameMap$Node
            java.lang.String r11 = r4.toString()
            r3.<init>(r11, r4)
            io.netty.handler.codec.http.HttpMethod$EnumNameMap$Node r4 = new io.netty.handler.codec.http.HttpMethod$EnumNameMap$Node
            java.lang.String r11 = r5.toString()
            r4.<init>(r11, r5)
            io.netty.handler.codec.http.HttpMethod$EnumNameMap$Node r5 = new io.netty.handler.codec.http.HttpMethod$EnumNameMap$Node
            java.lang.String r11 = r6.toString()
            r5.<init>(r11, r6)
            io.netty.handler.codec.http.HttpMethod$EnumNameMap$Node r6 = new io.netty.handler.codec.http.HttpMethod$EnumNameMap$Node
            java.lang.String r11 = r7.toString()
            r6.<init>(r11, r7)
            io.netty.handler.codec.http.HttpMethod$EnumNameMap$Node r7 = new io.netty.handler.codec.http.HttpMethod$EnumNameMap$Node
            java.lang.String r11 = r8.toString()
            r7.<init>(r11, r8)
            r8 = 9
            io.netty.handler.codec.http.HttpMethod$EnumNameMap$Node[] r8 = new io.netty.handler.codec.http.HttpMethod.EnumNameMap.Node[r8]
            r11 = 0
            r8[r11] = r10
            r10 = 1
            r8[r10] = r0
            r0 = 2
            r8[r0] = r1
            r0 = 3
            r8[r0] = r2
            r0 = 4
            r8[r0] = r3
            r0 = 5
            r8[r0] = r4
            r0 = 6
            r8[r0] = r5
            r0 = 7
            r8[r0] = r6
            r0 = 8
            r8[r0] = r7
            r9.<init>(r8)
            io.netty.handler.codec.http.HttpMethod.methodMap = r9
            return
    }

    public HttpMethod(java.lang.String r4) {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = "name"
            java.lang.Object r4 = io.netty.util.internal.ObjectUtil.checkNotNull(r4, r0)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = r4.trim()
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L3e
            r0 = 0
        L16:
            int r1 = r4.length()
            if (r0 >= r1) goto L37
            char r1 = r4.charAt(r0)
            boolean r2 = java.lang.Character.isISOControl(r1)
            if (r2 != 0) goto L2f
            boolean r1 = java.lang.Character.isWhitespace(r1)
            if (r1 != 0) goto L2f
            int r0 = r0 + 1
            goto L16
        L2f:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "invalid character in name"
            r4.<init>(r0)
            throw r4
        L37:
            io.netty.util.AsciiString r4 = io.netty.util.AsciiString.cached(r4)
            r3.name = r4
            return
        L3e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "empty name"
            r4.<init>(r0)
            throw r4
    }

    public static io.netty.handler.codec.http.HttpMethod valueOf(java.lang.String r1) {
            io.netty.handler.codec.http.HttpMethod$EnumNameMap<io.netty.handler.codec.http.HttpMethod> r0 = io.netty.handler.codec.http.HttpMethod.methodMap
            java.lang.Object r0 = r0.get(r1)
            io.netty.handler.codec.http.HttpMethod r0 = (io.netty.handler.codec.http.HttpMethod) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            io.netty.handler.codec.http.HttpMethod r0 = new io.netty.handler.codec.http.HttpMethod
            r0.<init>(r1)
            return r0
    }

    public io.netty.util.AsciiString asciiName() {
            r1 = this;
            io.netty.util.AsciiString r0 = r1.name
            return r0
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(io.netty.handler.codec.http.HttpMethod r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = r1.name()
            java.lang.String r2 = r2.name()
            int r2 = r0.compareTo(r2)
            return r2
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(io.netty.handler.codec.http.HttpMethod r1) {
            r0 = this;
            io.netty.handler.codec.http.HttpMethod r1 = (io.netty.handler.codec.http.HttpMethod) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof io.netty.handler.codec.http.HttpMethod
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            io.netty.handler.codec.http.HttpMethod r2 = (io.netty.handler.codec.http.HttpMethod) r2
            java.lang.String r0 = r1.name()
            java.lang.String r2 = r2.name()
            boolean r2 = r0.equals(r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.name()
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String name() {
            r1 = this;
            io.netty.util.AsciiString r0 = r1.name
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            io.netty.util.AsciiString r0 = r1.name
            java.lang.String r0 = r0.toString()
            return r0
    }
}
