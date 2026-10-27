package com.bytedance.j.xt.tl;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class e {

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a = null;

        static {
                com.bytedance.j.xt.ae.xt$xt[] r0 = com.bytedance.j.xt.ae.xt.EnumC0213xt.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.j.xt.tl.e.a.a = r0
                com.bytedance.j.xt.ae.xt$xt r1 = com.bytedance.j.xt.ae.xt.EnumC0213xt.up     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.bytedance.j.xt.tl.e.a.a     // Catch: java.lang.NoSuchFieldError -> L1d
                com.bytedance.j.xt.ae.xt$xt r1 = com.bytedance.j.xt.ae.xt.EnumC0213xt.cw     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.bytedance.j.xt.tl.e.a.a     // Catch: java.lang.NoSuchFieldError -> L28
                com.bytedance.j.xt.ae.xt$xt r1 = com.bytedance.j.xt.ae.xt.EnumC0213xt.f2130r     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.bytedance.j.xt.tl.e.a.a     // Catch: java.lang.NoSuchFieldError -> L33
                com.bytedance.j.xt.ae.xt$xt r1 = com.bytedance.j.xt.ae.xt.EnumC0213xt.f2129m     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.bytedance.j.xt.tl.e.a.a     // Catch: java.lang.NoSuchFieldError -> L3e
                com.bytedance.j.xt.ae.xt$xt r1 = com.bytedance.j.xt.ae.xt.EnumC0213xt.xt     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    public e() {
            r1 = this;
            r1.<init>()
            return
    }

    private static com.bytedance.j.xt.ae.xt.EnumC0213xt a(android.content.Context r2) {
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r2.getSystemService(r0)     // Catch: java.lang.Throwable -> L44
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Throwable -> L44
            if (r0 != 0) goto Ld
            com.bytedance.j.xt.ae.xt$xt r2 = com.bytedance.j.xt.ae.xt.EnumC0213xt.j     // Catch: java.lang.Throwable -> L44
            return r2
        Ld:
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L41
            boolean r1 = r0.isAvailable()     // Catch: java.lang.Throwable -> L44
            if (r1 != 0) goto L1a
            goto L41
        L1a:
            int r0 = r0.getType()     // Catch: java.lang.Throwable -> L44
            r1 = 1
            if (r1 != r0) goto L24
            com.bytedance.j.xt.ae.xt$xt r2 = com.bytedance.j.xt.ae.xt.EnumC0213xt.up     // Catch: java.lang.Throwable -> L44
            return r2
        L24:
            if (r0 != 0) goto L3e
            java.lang.String r0 = "phone"
            java.lang.Object r2 = r2.getSystemService(r0)     // Catch: java.lang.Throwable -> L44
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2     // Catch: java.lang.Throwable -> L44
            int r2 = r2.getNetworkType()     // Catch: java.lang.Throwable -> L44
            switch(r2) {
                case 3: goto L3b;
                case 4: goto L35;
                case 5: goto L3b;
                case 6: goto L3b;
                case 7: goto L35;
                case 8: goto L3b;
                case 9: goto L3b;
                case 10: goto L3b;
                case 11: goto L35;
                case 12: goto L3b;
                case 13: goto L38;
                case 14: goto L3b;
                case 15: goto L3b;
                default: goto L35;
            }     // Catch: java.lang.Throwable -> L44
        L35:
            com.bytedance.j.xt.ae.xt$xt r2 = com.bytedance.j.xt.ae.xt.EnumC0213xt.xt     // Catch: java.lang.Throwable -> L44
            return r2
        L38:
            com.bytedance.j.xt.ae.xt$xt r2 = com.bytedance.j.xt.ae.xt.EnumC0213xt.f2129m     // Catch: java.lang.Throwable -> L44
            return r2
        L3b:
            com.bytedance.j.xt.ae.xt$xt r2 = com.bytedance.j.xt.ae.xt.EnumC0213xt.f2130r     // Catch: java.lang.Throwable -> L44
            return r2
        L3e:
            com.bytedance.j.xt.ae.xt$xt r2 = com.bytedance.j.xt.ae.xt.EnumC0213xt.xt     // Catch: java.lang.Throwable -> L44
            return r2
        L41:
            com.bytedance.j.xt.ae.xt$xt r2 = com.bytedance.j.xt.ae.xt.EnumC0213xt.j     // Catch: java.lang.Throwable -> L44
            return r2
        L44:
            com.bytedance.j.xt.ae.xt$xt r2 = com.bytedance.j.xt.ae.xt.EnumC0213xt.xt
            return r2
    }

    public static java.lang.String b(android.content.Context r0) {
            com.bytedance.j.xt.ae.xt$xt r0 = a(r0)
            java.lang.String r0 = c(r0)
            return r0
    }

    public static java.lang.String c(com.bytedance.j.xt.ae.xt.EnumC0213xt r1) {
            int[] r0 = com.bytedance.j.xt.tl.e.a.a     // Catch: java.lang.Exception -> L27
            int r1 = r1.ordinal()     // Catch: java.lang.Exception -> L27
            r1 = r0[r1]     // Catch: java.lang.Exception -> L27
            r0 = 1
            if (r1 == r0) goto L24
            r0 = 2
            if (r1 == r0) goto L21
            r0 = 3
            if (r1 == r0) goto L1e
            r0 = 4
            if (r1 == r0) goto L1b
            r0 = 5
            if (r1 == r0) goto L18
            goto L27
        L18:
            java.lang.String r1 = "mobile"
            return r1
        L1b:
            java.lang.String r1 = "4g"
            return r1
        L1e:
            java.lang.String r1 = "3g"
            return r1
        L21:
            java.lang.String r1 = "2g"
            return r1
        L24:
            java.lang.String r1 = "wifi"
            return r1
        L27:
            java.lang.String r1 = ""
            return r1
    }

    public static boolean d(android.content.Context r2) {
            r0 = 0
            java.lang.String r1 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r1)     // Catch: java.lang.Exception -> L1a
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2     // Catch: java.lang.Exception -> L1a
            if (r2 != 0) goto Lc
            return r0
        Lc:
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()     // Catch: java.lang.Exception -> L1a
            if (r2 == 0) goto L1a
            boolean r2 = r2.isAvailable()     // Catch: java.lang.Exception -> L1a
            if (r2 == 0) goto L1a
            r2 = 1
            return r2
        L1a:
            return r0
    }
}
