package xyz.adscope.common.network.cookie;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class CookieManager {
    private xyz.adscope.common.network.cookie.CookieStore a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.common.network.cookie.CookieManager$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class CookiePathComparator implements java.util.Comparator<java.net.HttpCookie> {
        private CookiePathComparator() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ CookiePathComparator(xyz.adscope.common.network.cookie.CookieManager.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(java.net.HttpCookie r1, java.net.HttpCookie r2) {
                r0 = this;
                java.net.HttpCookie r1 = (java.net.HttpCookie) r1
                java.net.HttpCookie r2 = (java.net.HttpCookie) r2
                int r1 = r0.compare2(r1, r2)
                return r1
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(java.net.HttpCookie r6, java.net.HttpCookie r7) {
                r5 = this;
                r0 = 0
                if (r6 != r7) goto L4
                return r0
            L4:
                r1 = -1
                if (r6 != 0) goto L8
                return r1
            L8:
                r2 = 1
                if (r7 != 0) goto Lc
                return r2
            Lc:
                java.lang.String r3 = r6.getName()
                java.lang.String r4 = r7.getName()
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L1b
                return r0
            L1b:
                java.lang.String r6 = r6.getPath()
                java.lang.String r6 = xyz.adscope.common.network.cookie.CookieManager.a(r6)
                java.lang.String r7 = r7.getPath()
                java.lang.String r7 = xyz.adscope.common.network.cookie.CookieManager.a(r7)
                boolean r3 = r6.startsWith(r7)
                if (r3 == 0) goto L32
                return r1
            L32:
                boolean r6 = r7.startsWith(r6)
                if (r6 == 0) goto L39
                return r2
            L39:
                return r0
        }
    }

    public CookieManager(xyz.adscope.common.network.cookie.CookieStore r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    private static int a(java.net.URI r2) {
            int r0 = r2.getPort()
            r1 = -1
            if (r0 != r1) goto L19
            java.lang.String r2 = r2.getScheme()
            java.lang.String r0 = "https"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L16
            r2 = 443(0x1bb, float:6.21E-43)
            return r2
        L16:
            r2 = 80
            return r2
        L19:
            return r0
    }

    static /* synthetic */ java.lang.String a(java.lang.String r0) {
            java.lang.String r0 = b(r0)
            return r0
    }

    private java.lang.String a(java.util.List<java.net.HttpCookie> r7) {
            r6 = this;
            xyz.adscope.common.network.cookie.CookieManager$CookiePathComparator r0 = new xyz.adscope.common.network.cookie.CookieManager$CookiePathComparator
            r1 = 0
            r0.<init>(r1)
            java.util.Collections.sort(r7, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r1 = r7.iterator()
            r2 = 1
            r3 = 1
        L14:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L2b
            java.lang.Object r4 = r1.next()
            java.net.HttpCookie r4 = (java.net.HttpCookie) r4
            int r5 = r4.getVersion()
            if (r5 >= r3) goto L14
            int r3 = r4.getVersion()
            goto L14
        L2b:
            if (r3 != r2) goto L32
            java.lang.String r1 = "$Version=\"1\"; "
            r0.append(r1)
        L32:
            r1 = 0
        L33:
            int r2 = r7.size()
            if (r1 >= r2) goto L50
            if (r1 == 0) goto L40
            java.lang.String r2 = "; "
            r0.append(r2)
        L40:
            java.lang.Object r2 = r7.get(r1)
            java.net.HttpCookie r2 = (java.net.HttpCookie) r2
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            int r1 = r1 + 1
            goto L33
        L50:
            java.lang.String r7 = r0.toString()
            return r7
    }

    private static boolean a(java.lang.String r4, int r5) {
            java.lang.String r0 = ","
            boolean r1 = r4.contains(r0)
            if (r1 == 0) goto L23
            java.lang.String[] r4 = r4.split(r0)
            java.lang.String r5 = java.lang.Integer.toString(r5)
            int r0 = r4.length
            r1 = 0
            r2 = 0
        L13:
            if (r2 >= r0) goto L22
            r3 = r4[r2]
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L1f
            r4 = 1
            return r4
        L1f:
            int r2 = r2 + 1
            goto L13
        L22:
            return r1
        L23:
            java.lang.String r5 = java.lang.Integer.toString(r5)
            boolean r4 = r4.equalsIgnoreCase(r5)
            return r4
    }

    private static boolean a(java.net.URI r0, java.net.HttpCookie r1) {
            java.lang.String r0 = r0.getPath()
            java.lang.String r0 = b(r0)
            java.lang.String r1 = r1.getPath()
            java.lang.String r1 = b(r1)
            boolean r0 = r0.startsWith(r1)
            return r0
    }

    private static java.lang.String b(java.lang.String r2) {
            if (r2 != 0) goto L4
            java.lang.String r2 = ""
        L4:
            java.lang.String r0 = "/"
            boolean r1 = r2.endsWith(r0)
            if (r1 != 0) goto L1b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = r1.toString()
        L1b:
            return r2
    }

    public void add(java.net.URI r6, java.util.List<java.lang.String> r7) {
            r5 = this;
            java.util.Iterator r7 = r7.iterator()
        L4:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L64
            java.lang.Object r0 = r7.next()
            java.lang.String r0 = (java.lang.String) r0
            java.util.List r0 = java.net.HttpCookie.parse(r0)
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4
            java.lang.Object r1 = r0.next()
            java.net.HttpCookie r1 = (java.net.HttpCookie) r1
            java.lang.String r2 = r1.getPath()
            if (r2 != 0) goto L36
            java.lang.String r2 = r6.getPath()
            java.lang.String r2 = b(r2)
            r1.setPath(r2)
            goto L3d
        L36:
            boolean r2 = a(r6, r1)
            if (r2 != 0) goto L3d
            goto L18
        L3d:
            java.lang.String r2 = r1.getDomain()
            if (r2 != 0) goto L4a
            java.lang.String r2 = r6.getHost()
            r1.setDomain(r2)
        L4a:
            java.lang.String r2 = r1.getPortlist()
            int r3 = a(r6)
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L5e
            boolean r2 = a(r2, r3)
            if (r2 == 0) goto L18
        L5e:
            xyz.adscope.common.network.cookie.CookieStore r2 = r5.a
            r2.add(r6, r1)
            goto L18
        L64:
            return
    }

    public java.util.List<java.lang.String> get(java.net.URI r8) {
            r7 = this;
            java.lang.String r0 = r8.getScheme()
            java.lang.String r1 = "https"
            boolean r0 = r1.equalsIgnoreCase(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            xyz.adscope.common.network.cookie.CookieStore r2 = r7.a
            java.util.List r2 = r2.get(r8)
            java.util.Iterator r2 = r2.iterator()
        L19:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4b
            java.lang.Object r3 = r2.next()
            java.net.HttpCookie r3 = (java.net.HttpCookie) r3
            boolean r4 = a(r8, r3)
            if (r4 == 0) goto L19
            if (r0 != 0) goto L33
            boolean r4 = r3.getSecure()
            if (r4 != 0) goto L19
        L33:
            java.lang.String r4 = r3.getPortlist()
            int r5 = a(r8)
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 != 0) goto L47
            boolean r4 = a(r4, r5)
            if (r4 == 0) goto L19
        L47:
            r1.add(r3)
            goto L19
        L4b:
            boolean r8 = r1.isEmpty()
            if (r8 == 0) goto L54
            java.util.List r8 = java.util.Collections.EMPTY_LIST
            return r8
        L54:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.String r0 = r7.a(r1)
            r8.add(r0)
            return r8
    }
}
