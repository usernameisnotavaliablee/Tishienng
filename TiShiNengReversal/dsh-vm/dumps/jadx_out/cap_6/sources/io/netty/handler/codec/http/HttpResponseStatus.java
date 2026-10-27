package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class HttpResponseStatus implements java.lang.Comparable<io.netty.handler.codec.http.HttpResponseStatus> {
    public static final io.netty.handler.codec.http.HttpResponseStatus ACCEPTED = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus BAD_GATEWAY = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus BAD_REQUEST = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus CONFLICT = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus CONTINUE = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus CREATED = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus EXPECTATION_FAILED = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus FAILED_DEPENDENCY = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus FORBIDDEN = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus FOUND = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus GATEWAY_TIMEOUT = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus GONE = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus HTTP_VERSION_NOT_SUPPORTED = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus INSUFFICIENT_STORAGE = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus INTERNAL_SERVER_ERROR = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus LENGTH_REQUIRED = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus LOCKED = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus METHOD_NOT_ALLOWED = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus MISDIRECTED_REQUEST = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus MOVED_PERMANENTLY = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus MULTIPLE_CHOICES = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus MULTI_STATUS = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus NETWORK_AUTHENTICATION_REQUIRED = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus NON_AUTHORITATIVE_INFORMATION = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus NOT_ACCEPTABLE = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus NOT_EXTENDED = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus NOT_FOUND = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus NOT_IMPLEMENTED = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus NOT_MODIFIED = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus NO_CONTENT = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus OK = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus PARTIAL_CONTENT = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus PAYMENT_REQUIRED = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus PERMANENT_REDIRECT = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus PRECONDITION_FAILED = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus PRECONDITION_REQUIRED = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus PROCESSING = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus PROXY_AUTHENTICATION_REQUIRED = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus REQUESTED_RANGE_NOT_SATISFIABLE = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus REQUEST_ENTITY_TOO_LARGE = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus REQUEST_HEADER_FIELDS_TOO_LARGE = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus REQUEST_TIMEOUT = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus REQUEST_URI_TOO_LONG = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus RESET_CONTENT = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus SEE_OTHER = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus SERVICE_UNAVAILABLE = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus SWITCHING_PROTOCOLS = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus TEMPORARY_REDIRECT = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus TOO_MANY_REQUESTS = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus UNAUTHORIZED = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus UNORDERED_COLLECTION = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus UNPROCESSABLE_ENTITY = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus UNSUPPORTED_MEDIA_TYPE = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus UPGRADE_REQUIRED = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus USE_PROXY = null;
    public static final io.netty.handler.codec.http.HttpResponseStatus VARIANT_ALSO_NEGOTIATES = null;
    private final byte[] bytes;
    private final int code;
    private final io.netty.util.AsciiString codeAsText;
    private io.netty.handler.codec.http.HttpStatusClass codeClass;
    private final java.lang.String reasonPhrase;

    static {
            r0 = 100
            java.lang.String r1 = "Continue"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.CONTINUE = r0
            r0 = 101(0x65, float:1.42E-43)
            java.lang.String r1 = "Switching Protocols"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.SWITCHING_PROTOCOLS = r0
            r0 = 102(0x66, float:1.43E-43)
            java.lang.String r1 = "Processing"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.PROCESSING = r0
            r0 = 200(0xc8, float:2.8E-43)
            java.lang.String r1 = "OK"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.OK = r0
            r0 = 201(0xc9, float:2.82E-43)
            java.lang.String r1 = "Created"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.CREATED = r0
            r0 = 202(0xca, float:2.83E-43)
            java.lang.String r1 = "Accepted"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.ACCEPTED = r0
            r0 = 203(0xcb, float:2.84E-43)
            java.lang.String r1 = "Non-Authoritative Information"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.NON_AUTHORITATIVE_INFORMATION = r0
            r0 = 204(0xcc, float:2.86E-43)
            java.lang.String r1 = "No Content"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.NO_CONTENT = r0
            r0 = 205(0xcd, float:2.87E-43)
            java.lang.String r1 = "Reset Content"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.RESET_CONTENT = r0
            r0 = 206(0xce, float:2.89E-43)
            java.lang.String r1 = "Partial Content"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.PARTIAL_CONTENT = r0
            r0 = 207(0xcf, float:2.9E-43)
            java.lang.String r1 = "Multi-Status"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.MULTI_STATUS = r0
            r0 = 300(0x12c, float:4.2E-43)
            java.lang.String r1 = "Multiple Choices"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.MULTIPLE_CHOICES = r0
            r0 = 301(0x12d, float:4.22E-43)
            java.lang.String r1 = "Moved Permanently"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.MOVED_PERMANENTLY = r0
            r0 = 302(0x12e, float:4.23E-43)
            java.lang.String r1 = "Found"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.FOUND = r0
            r0 = 303(0x12f, float:4.25E-43)
            java.lang.String r1 = "See Other"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.SEE_OTHER = r0
            r0 = 304(0x130, float:4.26E-43)
            java.lang.String r1 = "Not Modified"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.NOT_MODIFIED = r0
            r0 = 305(0x131, float:4.27E-43)
            java.lang.String r1 = "Use Proxy"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.USE_PROXY = r0
            r0 = 307(0x133, float:4.3E-43)
            java.lang.String r1 = "Temporary Redirect"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.TEMPORARY_REDIRECT = r0
            r0 = 308(0x134, float:4.32E-43)
            java.lang.String r1 = "Permanent Redirect"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.PERMANENT_REDIRECT = r0
            r0 = 400(0x190, float:5.6E-43)
            java.lang.String r1 = "Bad Request"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.BAD_REQUEST = r0
            r0 = 401(0x191, float:5.62E-43)
            java.lang.String r1 = "Unauthorized"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.UNAUTHORIZED = r0
            r0 = 402(0x192, float:5.63E-43)
            java.lang.String r1 = "Payment Required"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.PAYMENT_REQUIRED = r0
            r0 = 403(0x193, float:5.65E-43)
            java.lang.String r1 = "Forbidden"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.FORBIDDEN = r0
            r0 = 404(0x194, float:5.66E-43)
            java.lang.String r1 = "Not Found"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.NOT_FOUND = r0
            r0 = 405(0x195, float:5.68E-43)
            java.lang.String r1 = "Method Not Allowed"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.METHOD_NOT_ALLOWED = r0
            r0 = 406(0x196, float:5.69E-43)
            java.lang.String r1 = "Not Acceptable"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.NOT_ACCEPTABLE = r0
            r0 = 407(0x197, float:5.7E-43)
            java.lang.String r1 = "Proxy Authentication Required"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.PROXY_AUTHENTICATION_REQUIRED = r0
            r0 = 408(0x198, float:5.72E-43)
            java.lang.String r1 = "Request Timeout"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.REQUEST_TIMEOUT = r0
            r0 = 409(0x199, float:5.73E-43)
            java.lang.String r1 = "Conflict"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.CONFLICT = r0
            r0 = 410(0x19a, float:5.75E-43)
            java.lang.String r1 = "Gone"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.GONE = r0
            r0 = 411(0x19b, float:5.76E-43)
            java.lang.String r1 = "Length Required"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.LENGTH_REQUIRED = r0
            r0 = 412(0x19c, float:5.77E-43)
            java.lang.String r1 = "Precondition Failed"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.PRECONDITION_FAILED = r0
            r0 = 413(0x19d, float:5.79E-43)
            java.lang.String r1 = "Request Entity Too Large"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.REQUEST_ENTITY_TOO_LARGE = r0
            r0 = 414(0x19e, float:5.8E-43)
            java.lang.String r1 = "Request-URI Too Long"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.REQUEST_URI_TOO_LONG = r0
            r0 = 415(0x19f, float:5.82E-43)
            java.lang.String r1 = "Unsupported Media Type"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.UNSUPPORTED_MEDIA_TYPE = r0
            r0 = 416(0x1a0, float:5.83E-43)
            java.lang.String r1 = "Requested Range Not Satisfiable"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.REQUESTED_RANGE_NOT_SATISFIABLE = r0
            r0 = 417(0x1a1, float:5.84E-43)
            java.lang.String r1 = "Expectation Failed"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.EXPECTATION_FAILED = r0
            r0 = 421(0x1a5, float:5.9E-43)
            java.lang.String r1 = "Misdirected Request"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.MISDIRECTED_REQUEST = r0
            r0 = 422(0x1a6, float:5.91E-43)
            java.lang.String r1 = "Unprocessable Entity"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.UNPROCESSABLE_ENTITY = r0
            r0 = 423(0x1a7, float:5.93E-43)
            java.lang.String r1 = "Locked"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.LOCKED = r0
            r0 = 424(0x1a8, float:5.94E-43)
            java.lang.String r1 = "Failed Dependency"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.FAILED_DEPENDENCY = r0
            r0 = 425(0x1a9, float:5.96E-43)
            java.lang.String r1 = "Unordered Collection"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.UNORDERED_COLLECTION = r0
            r0 = 426(0x1aa, float:5.97E-43)
            java.lang.String r1 = "Upgrade Required"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.UPGRADE_REQUIRED = r0
            r0 = 428(0x1ac, float:6.0E-43)
            java.lang.String r1 = "Precondition Required"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.PRECONDITION_REQUIRED = r0
            r0 = 429(0x1ad, float:6.01E-43)
            java.lang.String r1 = "Too Many Requests"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.TOO_MANY_REQUESTS = r0
            r0 = 431(0x1af, float:6.04E-43)
            java.lang.String r1 = "Request Header Fields Too Large"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.REQUEST_HEADER_FIELDS_TOO_LARGE = r0
            r0 = 500(0x1f4, float:7.0E-43)
            java.lang.String r1 = "Internal Server Error"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.INTERNAL_SERVER_ERROR = r0
            r0 = 501(0x1f5, float:7.02E-43)
            java.lang.String r1 = "Not Implemented"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.NOT_IMPLEMENTED = r0
            r0 = 502(0x1f6, float:7.03E-43)
            java.lang.String r1 = "Bad Gateway"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.BAD_GATEWAY = r0
            r0 = 503(0x1f7, float:7.05E-43)
            java.lang.String r1 = "Service Unavailable"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.SERVICE_UNAVAILABLE = r0
            r0 = 504(0x1f8, float:7.06E-43)
            java.lang.String r1 = "Gateway Timeout"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.GATEWAY_TIMEOUT = r0
            r0 = 505(0x1f9, float:7.08E-43)
            java.lang.String r1 = "HTTP Version Not Supported"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.HTTP_VERSION_NOT_SUPPORTED = r0
            r0 = 506(0x1fa, float:7.09E-43)
            java.lang.String r1 = "Variant Also Negotiates"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.VARIANT_ALSO_NEGOTIATES = r0
            r0 = 507(0x1fb, float:7.1E-43)
            java.lang.String r1 = "Insufficient Storage"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.INSUFFICIENT_STORAGE = r0
            r0 = 510(0x1fe, float:7.15E-43)
            java.lang.String r1 = "Not Extended"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.NOT_EXTENDED = r0
            r0 = 511(0x1ff, float:7.16E-43)
            java.lang.String r1 = "Network Authentication Required"
            io.netty.handler.codec.http.HttpResponseStatus r0 = newStatus(r0, r1)
            io.netty.handler.codec.http.HttpResponseStatus.NETWORK_AUTHENTICATION_REQUIRED = r0
            return
    }

    private HttpResponseStatus(int r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            io.netty.handler.codec.http.HttpStatusClass r1 = io.netty.handler.codec.http.HttpStatusClass.valueOf(r3)
            io.netty.util.AsciiString r1 = r1.defaultReasonPhrase()
            r0.append(r1)
            java.lang.String r1 = " ("
            r0.append(r1)
            r0.append(r3)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            r2.<init>(r3, r0, r1)
            return
    }

    public HttpResponseStatus(int r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    private HttpResponseStatus(int r4, java.lang.String r5, boolean r6) {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = "code"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r4, r0)
            if (r5 == 0) goto L69
            r0 = 0
        Lb:
            int r1 = r5.length()
            if (r0 >= r1) goto L37
            char r1 = r5.charAt(r0)
            r2 = 10
            if (r1 == r2) goto L20
            r2 = 13
            if (r1 == r2) goto L20
            int r0 = r0 + 1
            goto Lb
        L20:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "reasonPhrase contains one of the following prohibited characters: \\r\\n: "
            r6.append(r0)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        L37:
            r3.code = r4
            java.lang.String r4 = java.lang.Integer.toString(r4)
            io.netty.util.AsciiString r0 = new io.netty.util.AsciiString
            r0.<init>(r4)
            r3.codeAsText = r0
            r3.reasonPhrase = r5
            if (r6 == 0) goto L65
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r4 = 32
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            java.nio.charset.Charset r5 = io.netty.util.CharsetUtil.US_ASCII
            byte[] r4 = r4.getBytes(r5)
            r3.bytes = r4
            return
        L65:
            r4 = 0
            r3.bytes = r4
            return
        L69:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "reasonPhrase"
            r4.<init>(r5)
            throw r4
    }

    private static io.netty.handler.codec.http.HttpResponseStatus newStatus(int r2, java.lang.String r3) {
            io.netty.handler.codec.http.HttpResponseStatus r0 = new io.netty.handler.codec.http.HttpResponseStatus
            r1 = 1
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static io.netty.handler.codec.http.HttpResponseStatus parseLine(io.netty.util.AsciiString r4) {
            io.netty.util.ByteProcessor r0 = io.netty.util.ByteProcessor.FIND_ASCII_SPACE     // Catch: java.lang.Exception -> L12
            int r0 = r4.forEachByte(r0)     // Catch: java.lang.Exception -> L12
            r1 = -1
            if (r0 != r1) goto L14
            int r0 = r4.parseInt()     // Catch: java.lang.Exception -> L12
            io.netty.handler.codec.http.HttpResponseStatus r4 = valueOf(r0)     // Catch: java.lang.Exception -> L12
            return r4
        L12:
            r0 = move-exception
            goto L24
        L14:
            r1 = 0
            int r1 = r4.parseInt(r1, r0)     // Catch: java.lang.Exception -> L12
            int r0 = r0 + 1
            java.lang.String r0 = r4.toString(r0)     // Catch: java.lang.Exception -> L12
            io.netty.handler.codec.http.HttpResponseStatus r4 = valueOf(r1, r0)     // Catch: java.lang.Exception -> L12
            return r4
        L24:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "malformed status line: "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4, r0)
            throw r1
    }

    public static io.netty.handler.codec.http.HttpResponseStatus parseLine(java.lang.CharSequence r1) {
            boolean r0 = r1 instanceof io.netty.util.AsciiString
            if (r0 == 0) goto Lb
            io.netty.util.AsciiString r1 = (io.netty.util.AsciiString) r1
            io.netty.handler.codec.http.HttpResponseStatus r1 = parseLine(r1)
            return r1
        Lb:
            java.lang.String r1 = r1.toString()
            io.netty.handler.codec.http.HttpResponseStatus r1 = parseLine(r1)
            return r1
    }

    public static io.netty.handler.codec.http.HttpResponseStatus parseLine(java.lang.String r4) {
            r0 = 32
            int r0 = r4.indexOf(r0)     // Catch: java.lang.Exception -> L12
            r1 = -1
            if (r0 != r1) goto L14
            int r0 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Exception -> L12
            io.netty.handler.codec.http.HttpResponseStatus r4 = valueOf(r0)     // Catch: java.lang.Exception -> L12
            return r4
        L12:
            r0 = move-exception
            goto L28
        L14:
            r1 = 0
            java.lang.String r1 = r4.substring(r1, r0)     // Catch: java.lang.Exception -> L12
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> L12
            int r0 = r0 + 1
            java.lang.String r0 = r4.substring(r0)     // Catch: java.lang.Exception -> L12
            io.netty.handler.codec.http.HttpResponseStatus r4 = valueOf(r1, r0)     // Catch: java.lang.Exception -> L12
            return r4
        L28:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "malformed status line: "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4, r0)
            throw r1
    }

    public static io.netty.handler.codec.http.HttpResponseStatus valueOf(int r1) {
            io.netty.handler.codec.http.HttpResponseStatus r0 = valueOf0(r1)
            if (r0 == 0) goto L7
            return r0
        L7:
            io.netty.handler.codec.http.HttpResponseStatus r0 = new io.netty.handler.codec.http.HttpResponseStatus
            r0.<init>(r1)
            return r0
    }

    public static io.netty.handler.codec.http.HttpResponseStatus valueOf(int r2, java.lang.String r3) {
            io.netty.handler.codec.http.HttpResponseStatus r0 = valueOf0(r2)
            if (r0 == 0) goto L11
            java.lang.String r1 = r0.reasonPhrase()
            boolean r1 = r1.contentEquals(r3)
            if (r1 == 0) goto L11
            return r0
        L11:
            io.netty.handler.codec.http.HttpResponseStatus r0 = new io.netty.handler.codec.http.HttpResponseStatus
            r0.<init>(r2, r3)
            return r0
    }

    private static io.netty.handler.codec.http.HttpResponseStatus valueOf0(int r1) {
            r0 = 307(0x133, float:4.3E-43)
            if (r1 == r0) goto Ld5
            r0 = 308(0x134, float:4.32E-43)
            if (r1 == r0) goto Ld2
            r0 = 428(0x1ac, float:6.0E-43)
            if (r1 == r0) goto Lcf
            r0 = 429(0x1ad, float:6.01E-43)
            if (r1 == r0) goto Lcc
            r0 = 431(0x1af, float:6.04E-43)
            if (r1 == r0) goto Lc9
            r0 = 510(0x1fe, float:7.15E-43)
            if (r1 == r0) goto Lc6
            r0 = 511(0x1ff, float:7.16E-43)
            if (r1 == r0) goto Lc3
            switch(r1) {
                case 100: goto Lc0;
                case 101: goto Lbd;
                case 102: goto Lba;
                default: goto L1f;
            }
        L1f:
            switch(r1) {
                case 200: goto Lb7;
                case 201: goto Lb4;
                case 202: goto Lb1;
                case 203: goto Lae;
                case 204: goto Lab;
                case 205: goto La8;
                case 206: goto La5;
                case 207: goto La2;
                default: goto L22;
            }
        L22:
            switch(r1) {
                case 300: goto L9f;
                case 301: goto L9c;
                case 302: goto L99;
                case 303: goto L96;
                case 304: goto L93;
                case 305: goto L90;
                default: goto L25;
            }
        L25:
            switch(r1) {
                case 400: goto L8d;
                case 401: goto L8a;
                case 402: goto L87;
                case 403: goto L84;
                case 404: goto L81;
                case 405: goto L7e;
                case 406: goto L7b;
                case 407: goto L78;
                case 408: goto L75;
                case 409: goto L72;
                case 410: goto L6f;
                case 411: goto L6c;
                case 412: goto L69;
                case 413: goto L66;
                case 414: goto L63;
                case 415: goto L60;
                case 416: goto L5d;
                case 417: goto L5a;
                default: goto L28;
            }
        L28:
            switch(r1) {
                case 421: goto L57;
                case 422: goto L54;
                case 423: goto L51;
                case 424: goto L4e;
                case 425: goto L4b;
                case 426: goto L48;
                default: goto L2b;
            }
        L2b:
            switch(r1) {
                case 500: goto L45;
                case 501: goto L42;
                case 502: goto L3f;
                case 503: goto L3c;
                case 504: goto L39;
                case 505: goto L36;
                case 506: goto L33;
                case 507: goto L30;
                default: goto L2e;
            }
        L2e:
            r1 = 0
            return r1
        L30:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.INSUFFICIENT_STORAGE
            return r1
        L33:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.VARIANT_ALSO_NEGOTIATES
            return r1
        L36:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.HTTP_VERSION_NOT_SUPPORTED
            return r1
        L39:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.GATEWAY_TIMEOUT
            return r1
        L3c:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.SERVICE_UNAVAILABLE
            return r1
        L3f:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.BAD_GATEWAY
            return r1
        L42:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.NOT_IMPLEMENTED
            return r1
        L45:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.INTERNAL_SERVER_ERROR
            return r1
        L48:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.UPGRADE_REQUIRED
            return r1
        L4b:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.UNORDERED_COLLECTION
            return r1
        L4e:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.FAILED_DEPENDENCY
            return r1
        L51:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.LOCKED
            return r1
        L54:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.UNPROCESSABLE_ENTITY
            return r1
        L57:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.MISDIRECTED_REQUEST
            return r1
        L5a:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.EXPECTATION_FAILED
            return r1
        L5d:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.REQUESTED_RANGE_NOT_SATISFIABLE
            return r1
        L60:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.UNSUPPORTED_MEDIA_TYPE
            return r1
        L63:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.REQUEST_URI_TOO_LONG
            return r1
        L66:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.REQUEST_ENTITY_TOO_LARGE
            return r1
        L69:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.PRECONDITION_FAILED
            return r1
        L6c:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.LENGTH_REQUIRED
            return r1
        L6f:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.GONE
            return r1
        L72:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.CONFLICT
            return r1
        L75:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.REQUEST_TIMEOUT
            return r1
        L78:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.PROXY_AUTHENTICATION_REQUIRED
            return r1
        L7b:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.NOT_ACCEPTABLE
            return r1
        L7e:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.METHOD_NOT_ALLOWED
            return r1
        L81:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.NOT_FOUND
            return r1
        L84:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.FORBIDDEN
            return r1
        L87:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.PAYMENT_REQUIRED
            return r1
        L8a:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.UNAUTHORIZED
            return r1
        L8d:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.BAD_REQUEST
            return r1
        L90:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.USE_PROXY
            return r1
        L93:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.NOT_MODIFIED
            return r1
        L96:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.SEE_OTHER
            return r1
        L99:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.FOUND
            return r1
        L9c:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.MOVED_PERMANENTLY
            return r1
        L9f:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.MULTIPLE_CHOICES
            return r1
        La2:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.MULTI_STATUS
            return r1
        La5:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.PARTIAL_CONTENT
            return r1
        La8:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.RESET_CONTENT
            return r1
        Lab:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.NO_CONTENT
            return r1
        Lae:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.NON_AUTHORITATIVE_INFORMATION
            return r1
        Lb1:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.ACCEPTED
            return r1
        Lb4:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.CREATED
            return r1
        Lb7:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.OK
            return r1
        Lba:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.PROCESSING
            return r1
        Lbd:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.SWITCHING_PROTOCOLS
            return r1
        Lc0:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.CONTINUE
            return r1
        Lc3:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.NETWORK_AUTHENTICATION_REQUIRED
            return r1
        Lc6:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.NOT_EXTENDED
            return r1
        Lc9:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.REQUEST_HEADER_FIELDS_TOO_LARGE
            return r1
        Lcc:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.TOO_MANY_REQUESTS
            return r1
        Lcf:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.PRECONDITION_REQUIRED
            return r1
        Ld2:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.PERMANENT_REDIRECT
            return r1
        Ld5:
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.TEMPORARY_REDIRECT
            return r1
    }

    public int code() {
            r1 = this;
            int r0 = r1.code
            return r0
    }

    public io.netty.util.AsciiString codeAsText() {
            r1 = this;
            io.netty.util.AsciiString r0 = r1.codeAsText
            return r0
    }

    public io.netty.handler.codec.http.HttpStatusClass codeClass() {
            r1 = this;
            io.netty.handler.codec.http.HttpStatusClass r0 = r1.codeClass
            if (r0 != 0) goto Lc
            int r0 = r1.code
            io.netty.handler.codec.http.HttpStatusClass r0 = io.netty.handler.codec.http.HttpStatusClass.valueOf(r0)
            r1.codeClass = r0
        Lc:
            return r0
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(io.netty.handler.codec.http.HttpResponseStatus r2) {
            r1 = this;
            int r0 = r1.code()
            int r2 = r2.code()
            int r0 = r0 - r2
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(io.netty.handler.codec.http.HttpResponseStatus r1) {
            r0 = this;
            io.netty.handler.codec.http.HttpResponseStatus r1 = (io.netty.handler.codec.http.HttpResponseStatus) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    void encode(io.netty.buffer.ByteBuf r3) {
            r2 = this;
            byte[] r0 = r2.bytes
            if (r0 != 0) goto L16
            io.netty.util.AsciiString r0 = r2.codeAsText
            io.netty.buffer.ByteBufUtil.copy(r0, r3)
            r0 = 32
            r3.writeByte(r0)
            java.lang.String r0 = r2.reasonPhrase
            java.nio.charset.Charset r1 = io.netty.util.CharsetUtil.US_ASCII
            r3.writeCharSequence(r0, r1)
            return
        L16:
            r3.writeBytes(r0)
            return
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof io.netty.handler.codec.http.HttpResponseStatus
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r2.code()
            io.netty.handler.codec.http.HttpResponseStatus r3 = (io.netty.handler.codec.http.HttpResponseStatus) r3
            int r3 = r3.code()
            if (r0 != r3) goto L14
            r3 = 1
            return r3
        L14:
            return r1
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.code()
            return r0
    }

    public java.lang.String reasonPhrase() {
            r1 = this;
            java.lang.String r0 = r1.reasonPhrase
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = r2.reasonPhrase
            int r1 = r1.length()
            int r1 = r1 + 4
            r0.<init>(r1)
            io.netty.util.AsciiString r1 = r2.codeAsText
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            java.lang.String r1 = r2.reasonPhrase
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
