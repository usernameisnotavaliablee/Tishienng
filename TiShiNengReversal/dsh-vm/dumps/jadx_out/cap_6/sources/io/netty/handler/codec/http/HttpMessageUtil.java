package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class HttpMessageUtil {
    private HttpMessageUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void appendCommon(java.lang.StringBuilder r1, io.netty.handler.codec.http.HttpMessage r2) {
            java.lang.String r0 = io.netty.util.internal.StringUtil.simpleClassName(r2)
            r1.append(r0)
            java.lang.String r0 = "(decodeResult: "
            r1.append(r0)
            io.netty.handler.codec.DecoderResult r0 = r2.decoderResult()
            r1.append(r0)
            java.lang.String r0 = ", version: "
            r1.append(r0)
            io.netty.handler.codec.http.HttpVersion r2 = r2.protocolVersion()
            r1.append(r2)
            r2 = 41
            r1.append(r2)
            java.lang.String r2 = io.netty.util.internal.StringUtil.NEWLINE
            r1.append(r2)
            return
    }

    private static void appendFullCommon(java.lang.StringBuilder r1, io.netty.handler.codec.http.FullHttpMessage r2) {
            java.lang.String r0 = io.netty.util.internal.StringUtil.simpleClassName(r2)
            r1.append(r0)
            java.lang.String r0 = "(decodeResult: "
            r1.append(r0)
            io.netty.handler.codec.DecoderResult r0 = r2.decoderResult()
            r1.append(r0)
            java.lang.String r0 = ", version: "
            r1.append(r0)
            io.netty.handler.codec.http.HttpVersion r0 = r2.protocolVersion()
            r1.append(r0)
            java.lang.String r0 = ", content: "
            r1.append(r0)
            io.netty.buffer.ByteBuf r2 = r2.content()
            r1.append(r2)
            r2 = 41
            r1.append(r2)
            java.lang.String r2 = io.netty.util.internal.StringUtil.NEWLINE
            r1.append(r2)
            return
    }

    static java.lang.StringBuilder appendFullRequest(java.lang.StringBuilder r1, io.netty.handler.codec.http.FullHttpRequest r2) {
            appendFullCommon(r1, r2)
            appendInitialLine(r1, r2)
            io.netty.handler.codec.http.HttpHeaders r0 = r2.headers()
            appendHeaders(r1, r0)
            io.netty.handler.codec.http.HttpHeaders r2 = r2.trailingHeaders()
            appendHeaders(r1, r2)
            removeLastNewLine(r1)
            return r1
    }

    static java.lang.StringBuilder appendFullResponse(java.lang.StringBuilder r1, io.netty.handler.codec.http.FullHttpResponse r2) {
            appendFullCommon(r1, r2)
            appendInitialLine(r1, r2)
            io.netty.handler.codec.http.HttpHeaders r0 = r2.headers()
            appendHeaders(r1, r0)
            io.netty.handler.codec.http.HttpHeaders r2 = r2.trailingHeaders()
            appendHeaders(r1, r2)
            removeLastNewLine(r1)
            return r1
    }

    private static void appendHeaders(java.lang.StringBuilder r2, io.netty.handler.codec.http.HttpHeaders r3) {
            java.util.Iterator r3 = r3.iterator()
        L4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            r2.append(r1)
            java.lang.String r1 = ": "
            r2.append(r1)
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r2.append(r0)
            java.lang.String r0 = io.netty.util.internal.StringUtil.NEWLINE
            r2.append(r0)
            goto L4
        L2d:
            return
    }

    private static void appendInitialLine(java.lang.StringBuilder r2, io.netty.handler.codec.http.HttpRequest r3) {
            io.netty.handler.codec.http.HttpMethod r0 = r3.method()
            r2.append(r0)
            r0 = 32
            r2.append(r0)
            java.lang.String r1 = r3.uri()
            r2.append(r1)
            r2.append(r0)
            io.netty.handler.codec.http.HttpVersion r3 = r3.protocolVersion()
            r2.append(r3)
            java.lang.String r3 = io.netty.util.internal.StringUtil.NEWLINE
            r2.append(r3)
            return
    }

    private static void appendInitialLine(java.lang.StringBuilder r1, io.netty.handler.codec.http.HttpResponse r2) {
            io.netty.handler.codec.http.HttpVersion r0 = r2.protocolVersion()
            r1.append(r0)
            r0 = 32
            r1.append(r0)
            io.netty.handler.codec.http.HttpResponseStatus r2 = r2.status()
            r1.append(r2)
            java.lang.String r2 = io.netty.util.internal.StringUtil.NEWLINE
            r1.append(r2)
            return
    }

    static java.lang.StringBuilder appendRequest(java.lang.StringBuilder r0, io.netty.handler.codec.http.HttpRequest r1) {
            appendCommon(r0, r1)
            appendInitialLine(r0, r1)
            io.netty.handler.codec.http.HttpHeaders r1 = r1.headers()
            appendHeaders(r0, r1)
            removeLastNewLine(r0)
            return r0
    }

    static java.lang.StringBuilder appendResponse(java.lang.StringBuilder r0, io.netty.handler.codec.http.HttpResponse r1) {
            appendCommon(r0, r1)
            appendInitialLine(r0, r1)
            io.netty.handler.codec.http.HttpHeaders r1 = r1.headers()
            appendHeaders(r0, r1)
            removeLastNewLine(r0)
            return r0
    }

    private static void removeLastNewLine(java.lang.StringBuilder r2) {
            int r0 = r2.length()
            java.lang.String r1 = io.netty.util.internal.StringUtil.NEWLINE
            int r1 = r1.length()
            int r0 = r0 - r1
            r2.setLength(r0)
            return
    }
}
