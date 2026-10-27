package xyz.adscope.amps.tool.test;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class FileUtils {
    public FileUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.RequiresApi(api = 19)
    public static java.lang.String getTestConfig(android.content.Context r7) throws java.io.IOException {
            r0 = 0
            android.content.res.AssetManager r7 = r7.getAssets()     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L55
            java.lang.String r1 = "amps_test_config_json_bz"
            java.io.InputStream r7 = r7.open(r1)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L55
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L4a
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L4a
            r1.<init>(r7, r2)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L4a
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L40
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L40
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            r0.<init>()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
        L1c:
            java.lang.String r3 = r2.readLine()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            if (r3 == 0) goto L2b
            r0.append(r3)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            goto L1c
        L26:
            r0 = move-exception
            goto L86
        L29:
            r0 = move-exception
            goto L5a
        L2b:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            if (r7 == 0) goto L34
            r7.close()
        L34:
            r1.close()
            r2.close()
            return r0
        L3b:
            r2 = move-exception
            r6 = r2
            r2 = r0
            r0 = r6
            goto L86
        L40:
            r2 = move-exception
            r6 = r2
            r2 = r0
            r0 = r6
            goto L5a
        L45:
            r1 = move-exception
            r2 = r0
            r0 = r1
            r1 = r2
            goto L86
        L4a:
            r1 = move-exception
            r2 = r0
            r0 = r1
            r1 = r2
            goto L5a
        L4f:
            r7 = move-exception
            r1 = r0
            r2 = r1
            r0 = r7
            r7 = r2
            goto L86
        L55:
            r7 = move-exception
            r1 = r0
            r2 = r1
            r0 = r7
            r7 = r2
        L5a:
            java.lang.String r3 = "amps_log_tag"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26
            r4.<init>()     // Catch: java.lang.Throwable -> L26
            java.lang.String r5 = "getTestConfig error is = "
            r4.append(r5)     // Catch: java.lang.Throwable -> L26
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L26
            r4.append(r0)     // Catch: java.lang.Throwable -> L26
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L26
            xyz.adscope.common.tool.LogUtil.e(r3, r0)     // Catch: java.lang.Throwable -> L26
            if (r7 == 0) goto L79
            r7.close()
        L79:
            if (r1 == 0) goto L7e
            r1.close()
        L7e:
            if (r2 == 0) goto L83
            r2.close()
        L83:
            java.lang.String r7 = ""
            return r7
        L86:
            if (r7 == 0) goto L8b
            r7.close()
        L8b:
            if (r1 == 0) goto L90
            r1.close()
        L90:
            if (r2 == 0) goto L95
            r2.close()
        L95:
            throw r0
    }
}
