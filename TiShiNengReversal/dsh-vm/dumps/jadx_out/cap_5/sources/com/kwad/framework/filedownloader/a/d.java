package com.kwad.framework.filedownloader.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class d {
    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.kwad.framework.filedownloader.a.b a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r9, com.kwad.framework.filedownloader.a.b r10, java.util.List<java.lang.String> r11) {
            int r0 = r10.getResponseCode()
            java.lang.String r1 = "Location"
            java.lang.String r2 = r10.bn(r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = 0
            r5 = 0
        L11:
            boolean r6 = bB(r0)
            if (r6 == 0) goto L78
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L5e
            boolean r8 = com.kwad.framework.filedownloader.f.d.apD
            if (r8 == 0) goto L33
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r4] = r2
            r8[r7] = r0
            r8[r6] = r3
            java.lang.Class<com.kwad.framework.filedownloader.a.d> r0 = com.kwad.framework.filedownloader.a.d.class
            java.lang.String r6 = "redirect to %s with %d, %s"
            com.kwad.framework.filedownloader.f.d.c(r0, r6, r8)
        L33:
            r10.xS()
            com.kwad.framework.filedownloader.a.b r10 = a(r9, r2)
            r3.add(r2)
            r10.execute()
            int r0 = r10.getResponseCode()
            java.lang.String r2 = r10.bn(r1)
            int r5 = r5 + r7
            r6 = 10
            if (r5 >= r6) goto L4e
            goto L11
        L4e:
            java.lang.IllegalAccessException r9 = new java.lang.IllegalAccessException
            java.lang.Object[] r10 = new java.lang.Object[r7]
            r10[r4] = r3
            java.lang.String r11 = "redirect too many times! %s"
            java.lang.String r10 = com.kwad.framework.filedownloader.f.f.c(r11, r10)
            r9.<init>(r10)
            throw r9
        L5e:
            java.lang.IllegalAccessException r9 = new java.lang.IllegalAccessException
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            java.util.Map r10 = r10.xR()
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r4] = r11
            r0[r7] = r10
            java.lang.String r10 = "receive %d (redirect) but the location is null with response [%s]"
            java.lang.String r10 = com.kwad.framework.filedownloader.f.f.c(r10, r0)
            r9.<init>(r10)
            throw r9
        L78:
            if (r11 == 0) goto L7d
            r11.addAll(r3)
        L7d:
            return r10
    }

    private static com.kwad.framework.filedownloader.a.b a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r3, java.lang.String r4) {
            com.kwad.framework.filedownloader.download.b r0 = com.kwad.framework.filedownloader.download.b.yc()
            com.kwad.framework.filedownloader.a.b r4 = r0.br(r4)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L10:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3e
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L10
            java.util.Iterator r0 = r0.iterator()
        L2e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L10
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            r4.addHeader(r1, r2)
            goto L2e
        L3e:
            return r4
    }

    private static boolean bB(int r1) {
            r0 = 301(0x12d, float:4.22E-43)
            if (r1 == r0) goto L1b
            r0 = 302(0x12e, float:4.23E-43)
            if (r1 == r0) goto L1b
            r0 = 303(0x12f, float:4.25E-43)
            if (r1 == r0) goto L1b
            r0 = 300(0x12c, float:4.2E-43)
            if (r1 == r0) goto L1b
            r0 = 307(0x133, float:4.3E-43)
            if (r1 == r0) goto L1b
            r0 = 308(0x134, float:4.32E-43)
            if (r1 != r0) goto L19
            goto L1b
        L19:
            r1 = 0
            return r1
        L1b:
            r1 = 1
            return r1
    }
}
