package com.bumptech.glide.repackaged.com.squareup.javapoet;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class n {
    static final javax.lang.model.element.Modifier a = null;

    static {
            java.lang.String r0 = "DEFAULT"
            javax.lang.model.element.Modifier r0 = javax.lang.model.element.Modifier.valueOf(r0)     // Catch: java.lang.IllegalArgumentException -> L7
            goto L8
        L7:
            r0 = 0
        L8:
            com.bumptech.glide.repackaged.com.squareup.javapoet.n.a = r0
            return
    }

    public n() {
            r1 = this;
            r1.<init>()
            return
    }

    static java.lang.String a(char r2) {
            r0 = 12
            if (r2 == r0) goto L48
            r0 = 13
            if (r2 == r0) goto L45
            r0 = 34
            if (r2 == r0) goto L42
            r0 = 39
            if (r2 == r0) goto L3f
            r0 = 92
            if (r2 == r0) goto L3c
            switch(r2) {
                case 8: goto L39;
                case 9: goto L36;
                case 10: goto L33;
                default: goto L17;
            }
        L17:
            boolean r0 = java.lang.Character.isISOControl(r2)
            if (r0 == 0) goto L2e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            java.lang.String r2 = "\\u%04x"
            java.lang.String r2 = java.lang.String.format(r2, r0)
            return r2
        L2e:
            java.lang.String r2 = java.lang.Character.toString(r2)
            return r2
        L33:
            java.lang.String r2 = "\\n"
            return r2
        L36:
            java.lang.String r2 = "\\t"
            return r2
        L39:
            java.lang.String r2 = "\\b"
            return r2
        L3c:
            java.lang.String r2 = "\\\\"
            return r2
        L3f:
            java.lang.String r2 = "\\'"
            return r2
        L42:
            java.lang.String r2 = "\""
            return r2
        L45:
            java.lang.String r2 = "\\r"
            return r2
        L48:
            java.lang.String r2 = "\\f"
            return r2
    }

    static void b(boolean r0, java.lang.String r1, java.lang.Object... r2) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1)
            throw r0
    }

    static <T> T c(T r0, java.lang.String r1, java.lang.Object... r2) {
            if (r0 == 0) goto L3
            return r0
        L3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1)
            throw r0
    }

    static void d(boolean r0, java.lang.String r1, java.lang.Object... r2) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1)
            throw r0
    }

    static boolean e(java.util.Collection<javax.lang.model.element.Modifier> r1) {
            javax.lang.model.element.Modifier r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.a
            if (r0 == 0) goto Lc
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    static <T> java.util.List<T> f(java.util.Collection<T> r1) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            java.util.List r1 = java.util.Collections.unmodifiableList(r0)
            return r1
    }

    static <K, V> java.util.Map<K, V> g(java.util.Map<K, V> r1) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r1)
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r0)
            return r1
    }

    static <K, V> java.util.Map<K, java.util.List<V>> h(java.util.Map<K, java.util.List<V>> r3) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        Ld:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.List r2 = (java.util.List) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L26
            goto Ld
        L26:
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.List r1 = f(r1)
            r0.put(r2, r1)
            goto Ld
        L38:
            java.util.Map r3 = java.util.Collections.unmodifiableMap(r0)
            return r3
    }

    static <T> java.util.Set<T> i(java.util.Collection<T> r1) {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>(r1)
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r0)
            return r1
    }

    static java.lang.String j(java.lang.String r3, java.util.List<java.lang.String> r4) {
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L9
            java.lang.String r3 = ""
            return r3
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            java.lang.Object r1 = r4.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            r1 = 1
        L19:
            int r2 = r4.size()
            if (r1 >= r2) goto L2e
            r0.append(r3)
            java.lang.Object r2 = r4.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            int r1 = r1 + 1
            goto L19
        L2e:
            java.lang.String r3 = r0.toString()
            return r3
    }

    static void k(java.util.Set<javax.lang.model.element.Modifier> r6, javax.lang.model.element.Modifier... r7) {
            int r0 = r7.length
            r1 = 0
            r2 = 0
            r3 = 0
        L4:
            if (r2 >= r0) goto L1a
            r4 = r7[r2]
            if (r4 != 0) goto Lf
            javax.lang.model.element.Modifier r5 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.a
            if (r5 != 0) goto Lf
            goto L17
        Lf:
            boolean r4 = r6.contains(r4)
            if (r4 == 0) goto L17
            int r3 = r3 + 1
        L17:
            int r2 = r2 + 1
            goto L4
        L1a:
            r0 = 1
            if (r3 != r0) goto L1f
            r2 = 1
            goto L20
        L1f:
            r2 = 0
        L20:
            java.lang.String r7 = java.util.Arrays.toString(r7)
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r6
            r3[r0] = r7
            java.lang.String r6 = "modifiers %s must contain one of %s"
            b(r2, r6, r3)
            return
    }

    static java.lang.String l(java.lang.String r5, java.lang.String r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r5.length()
            int r1 = r1 + 2
            r0.<init>(r1)
            r1 = 34
            r0.append(r1)
            r2 = 0
        L11:
            int r3 = r5.length()
            if (r2 >= r3) goto L53
            char r3 = r5.charAt(r2)
            r4 = 39
            if (r3 != r4) goto L25
            java.lang.String r3 = "'"
            r0.append(r3)
            goto L50
        L25:
            if (r3 != r1) goto L2d
            java.lang.String r3 = "\\\""
            r0.append(r3)
            goto L50
        L2d:
            java.lang.String r4 = a(r3)
            r0.append(r4)
            r4 = 10
            if (r3 != r4) goto L50
            int r3 = r2 + 1
            int r4 = r5.length()
            if (r3 >= r4) goto L50
            java.lang.String r3 = "\"\n"
            r0.append(r3)
            r0.append(r6)
            r0.append(r6)
            java.lang.String r3 = "+ \""
            r0.append(r3)
        L50:
            int r2 = r2 + 1
            goto L11
        L53:
            r0.append(r1)
            java.lang.String r5 = r0.toString()
            return r5
    }

    static <T> java.util.Set<T> m(java.util.Set<T> r1, java.util.Set<T> r2) {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r0.addAll(r1)
            r0.addAll(r2)
            return r0
    }
}
