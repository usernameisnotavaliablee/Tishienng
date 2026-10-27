package androidx.core.net;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class UriCompat {
    private UriCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static java.lang.String toSafeString(@androidx.annotation.NonNull android.net.Uri r7) {
            java.lang.String r0 = r7.getScheme()
            java.lang.String r1 = r7.getSchemeSpecificPart()
            r2 = 58
            r3 = 64
            if (r0 == 0) goto Ld7
            java.lang.String r4 = "tel"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 != 0) goto La3
            java.lang.String r4 = "sip"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 != 0) goto La3
            java.lang.String r4 = "sms"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 != 0) goto La3
            java.lang.String r4 = "smsto"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 != 0) goto La3
            java.lang.String r4 = "mailto"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 != 0) goto La3
            java.lang.String r4 = "nfc"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 == 0) goto L3f
            goto La3
        L3f:
            java.lang.String r4 = "http"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 != 0) goto L5f
            java.lang.String r4 = "https"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 != 0) goto L5f
            java.lang.String r4 = "ftp"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 != 0) goto L5f
            java.lang.String r4 = "rtsp"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 == 0) goto Ld7
        L5f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "//"
            r1.append(r4)
            java.lang.String r4 = r7.getHost()
            java.lang.String r5 = ""
            if (r4 == 0) goto L76
            java.lang.String r4 = r7.getHost()
            goto L77
        L76:
            r4 = r5
        L77:
            r1.append(r4)
            int r4 = r7.getPort()
            r6 = -1
            if (r4 == r6) goto L96
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = ":"
            r4.append(r5)
            int r7 = r7.getPort()
            r4.append(r7)
            java.lang.String r5 = r4.toString()
        L96:
            r1.append(r5)
            java.lang.String r7 = "/..."
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            goto Ld7
        La3:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r3)
            r7.append(r0)
            r7.append(r2)
            if (r1 == 0) goto Ld2
            r0 = 0
        Lb1:
            int r2 = r1.length()
            if (r0 >= r2) goto Ld2
            char r2 = r1.charAt(r0)
            r4 = 45
            if (r2 == r4) goto Lcc
            if (r2 == r3) goto Lcc
            r4 = 46
            if (r2 != r4) goto Lc6
            goto Lcc
        Lc6:
            r2 = 120(0x78, float:1.68E-43)
            r7.append(r2)
            goto Lcf
        Lcc:
            r7.append(r2)
        Lcf:
            int r0 = r0 + 1
            goto Lb1
        Ld2:
            java.lang.String r7 = r7.toString()
            return r7
        Ld7:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r3)
            if (r0 == 0) goto Le4
            r7.append(r0)
            r7.append(r2)
        Le4:
            if (r1 == 0) goto Le9
            r7.append(r1)
        Le9:
            java.lang.String r7 = r7.toString()
            return r7
    }
}
