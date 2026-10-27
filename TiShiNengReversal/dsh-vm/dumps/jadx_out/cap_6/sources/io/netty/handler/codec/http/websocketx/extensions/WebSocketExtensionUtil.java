package io.netty.handler.codec.http.websocketx.extensions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class WebSocketExtensionUtil {
    private static final java.lang.String EXTENSION_SEPARATOR = ",";
    private static final java.util.regex.Pattern PARAMETER = null;
    private static final char PARAMETER_EQUAL = '=';
    private static final java.lang.String PARAMETER_SEPARATOR = ";";

    static {
            java.lang.String r0 = "^([^=]+)(=[\\\"]?([^\\\"]+)[\\\"]?)?$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionUtil.PARAMETER = r0
            return
    }

    private WebSocketExtensionUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.lang.String appendExtension(java.lang.String r2, java.lang.String r3, java.util.Map<java.lang.String, java.lang.String> r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            if (r2 == 0) goto L9
            int r1 = r2.length()
            goto Lf
        L9:
            int r1 = r3.length()
            int r1 = r1 + 1
        Lf:
            r0.<init>(r1)
            if (r2 == 0) goto L26
            java.lang.String r1 = r2.trim()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L26
            r0.append(r2)
            java.lang.String r2 = ","
            r0.append(r2)
        L26:
            r0.append(r3)
            java.util.Set r2 = r4.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L31:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L60
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.String r4 = ";"
            r0.append(r4)
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
            java.lang.Object r4 = r3.getValue()
            if (r4 == 0) goto L31
            r4 = 61
            r0.append(r4)
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            r0.append(r3)
            goto L31
        L60:
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static java.util.List<io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionData> extractExtensions(java.lang.String r12) {
            java.lang.String r0 = ","
            java.lang.String[] r12 = r12.split(r0)
            int r0 = r12.length
            if (r0 <= 0) goto L66
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r12.length
            r0.<init>(r1)
            int r1 = r12.length
            r2 = 0
            r3 = 0
        L12:
            if (r3 >= r1) goto L65
            r4 = r12[r3]
            java.lang.String r5 = ";"
            java.lang.String[] r4 = r4.split(r5)
            r5 = r4[r2]
            java.lang.String r5 = r5.trim()
            int r6 = r4.length
            r7 = 1
            if (r6 <= r7) goto L58
            java.util.HashMap r6 = new java.util.HashMap
            int r8 = r4.length
            int r8 = r8 - r7
            r6.<init>(r8)
            r8 = 1
        L2e:
            int r9 = r4.length
            if (r8 >= r9) goto L5a
            r9 = r4[r8]
            java.lang.String r9 = r9.trim()
            java.util.regex.Pattern r10 = io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionUtil.PARAMETER
            java.util.regex.Matcher r9 = r10.matcher(r9)
            boolean r10 = r9.matches()
            if (r10 == 0) goto L55
            java.lang.String r10 = r9.group(r7)
            if (r10 == 0) goto L55
            java.lang.String r10 = r9.group(r7)
            r11 = 3
            java.lang.String r9 = r9.group(r11)
            r6.put(r10, r9)
        L55:
            int r8 = r8 + 1
            goto L2e
        L58:
            java.util.Map r6 = java.util.Collections.EMPTY_MAP
        L5a:
            io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionData r4 = new io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionData
            r4.<init>(r5, r6)
            r0.add(r4)
            int r3 = r3 + 1
            goto L12
        L65:
            return r0
        L66:
            java.util.List r12 = java.util.Collections.EMPTY_LIST
            return r12
    }

    static boolean isWebsocketUpgrade(io.netty.handler.codec.http.HttpHeaders r3) {
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.CONNECTION
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderValues.UPGRADE
            r2 = 1
            boolean r0 = r3.containsValue(r0, r1, r2)
            if (r0 == 0) goto L16
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.UPGRADE
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderValues.WEBSOCKET
            boolean r3 = r3.contains(r0, r1, r2)
            if (r3 == 0) goto L16
            return r2
        L16:
            r3 = 0
            return r3
    }
}
