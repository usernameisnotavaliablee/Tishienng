package j;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a extends javax.mail.Authenticator {
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f7617b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String[] f7618c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f7619d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f7620e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.String f7621f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.String f7622g;

    /* renamed from: h, reason: collision with root package name */
    private java.lang.String f7623h;

    /* renamed from: i, reason: collision with root package name */
    private java.lang.String f7624i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f7625j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f7626k;
    private javax.mail.Multipart l;

    public a() {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "smtp.qq.com"
            r2.f7622g = r0
            java.lang.String r0 = "587"
            r2.f7620e = r0
            r2.f7621f = r0
            java.lang.String r0 = ""
            r2.a = r0
            r2.f7617b = r0
            r2.f7619d = r0
            r2.f7623h = r0
            r2.f7624i = r0
            r0 = 0
            r2.f7626k = r0
            r0 = 1
            r2.f7625j = r0
            javax.mail.internet.MimeMultipart r0 = new javax.mail.internet.MimeMultipart
            r0.<init>()
            r2.l = r0
            javax.activation.CommandMap r0 = javax.activation.CommandMap.getDefaultCommandMap()
            javax.activation.MailcapCommandMap r0 = (javax.activation.MailcapCommandMap) r0
            java.lang.String r1 = "text/html;; x-java-content-handler=com.sun.mail.handlers.text_html"
            r0.addMailcap(r1)
            java.lang.String r1 = "text/xml;; x-java-content-handler=com.sun.mail.handlers.text_xml"
            r0.addMailcap(r1)
            java.lang.String r1 = "text/plain;; x-java-content-handler=com.sun.mail.handlers.text_plain"
            r0.addMailcap(r1)
            java.lang.String r1 = "multipart/*;; x-java-content-handler=com.sun.mail.handlers.multipart_mixed"
            r0.addMailcap(r1)
            java.lang.String r1 = "message/rfc822;; x-java-content-handler=com.sun.mail.handlers.message_rfc822"
            r0.addMailcap(r1)
            javax.activation.CommandMap.setDefaultCommandMap(r0)
            return
    }

    public a(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.f7617b = r2
            return
    }

    private java.util.Properties a() {
            r3 = this;
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            java.lang.String r1 = "mail.smtp.host"
            java.lang.String r2 = r3.f7622g
            r0.put(r1, r2)
            boolean r1 = r3.f7626k
            java.lang.String r2 = "true"
            if (r1 == 0) goto L17
            java.lang.String r1 = "mail.debug"
            r0.put(r1, r2)
        L17:
            boolean r1 = r3.f7625j
            if (r1 == 0) goto L20
            java.lang.String r1 = "mail.smtp.auth"
            r0.put(r1, r2)
        L20:
            java.lang.String r1 = "mail.smtp.port"
            java.lang.String r2 = r3.f7620e
            r0.put(r1, r2)
            java.lang.String r1 = "mail.password"
            java.lang.String r2 = "dylanandroid2dev"
            r0.put(r1, r2)
            java.lang.String r1 = "mail.smtp.socketFactory.port"
            java.lang.String r2 = r3.f7621f
            r0.put(r1, r2)
            java.lang.String r1 = "mail.smtp.socketFactory.class"
            java.lang.String r2 = "javax.net.ssl.SSLSocketFactory"
            r0.put(r1, r2)
            java.lang.String r1 = "mail.smtp.socketFactory.fallback"
            java.lang.String r2 = "false"
            r0.put(r1, r2)
            return r0
    }

    public void A(java.lang.String r1) {
            r0 = this;
            r0.f7623h = r1
            return
    }

    public void B(java.lang.String[] r1) {
            r0 = this;
            r0.f7618c = r1
            return
    }

    public void C(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void b(java.lang.String r4) throws java.lang.Exception {
            r3 = this;
            javax.mail.internet.MimeBodyPart r0 = new javax.mail.internet.MimeBodyPart
            r0.<init>()
            javax.activation.FileDataSource r1 = new javax.activation.FileDataSource
            r1.<init>(r4)
            javax.activation.DataHandler r2 = new javax.activation.DataHandler
            r2.<init>(r1)
            r0.setDataHandler(r2)
            java.lang.String r1 = "/"
            java.lang.String[] r4 = r4.split(r1)
            int r1 = r4.length
            int r1 = r1 + (-1)
            r4 = r4[r1]
            r0.setFileName(r4)
            javax.mail.Multipart r4 = r3.l
            r4.addBodyPart(r0)
            return
    }

    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.f7624i
            return r0
    }

    public java.lang.String d() {
            r1 = this;
            java.lang.String r0 = r1.f7624i
            return r0
    }

    public java.lang.String e() {
            r1 = this;
            java.lang.String r0 = r1.f7619d
            return r0
    }

    public java.lang.String f() {
            r1 = this;
            java.lang.String r0 = r1.f7622g
            return r0
    }

    public javax.mail.Multipart g() {
            r1 = this;
            javax.mail.Multipart r0 = r1.l
            return r0
    }

    public javax.mail.PasswordAuthentication getPasswordAuthentication() {
            r3 = this;
            javax.mail.PasswordAuthentication r0 = new javax.mail.PasswordAuthentication
            java.lang.String r1 = r3.a
            java.lang.String r2 = r3.f7617b
            r0.<init>(r1, r2)
            return r0
    }

    public java.lang.String h() {
            r1 = this;
            java.lang.String r0 = r1.f7617b
            return r0
    }

    public java.lang.String i() {
            r1 = this;
            java.lang.String r0 = r1.f7620e
            return r0
    }

    public java.lang.String j() {
            r1 = this;
            java.lang.String r0 = r1.f7621f
            return r0
    }

    public java.lang.String k() {
            r1 = this;
            java.lang.String r0 = r1.f7623h
            return r0
    }

    public java.lang.String[] l() {
            r1 = this;
            java.lang.String[] r0 = r1.f7618c
            return r0
    }

    public java.lang.String m() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public boolean n() {
            r1 = this;
            boolean r0 = r1.f7625j
            return r0
    }

    public boolean o() {
            r1 = this;
            boolean r0 = r1.f7626k
            return r0
    }

    public boolean p() throws java.lang.Exception {
            r5 = this;
            java.util.Properties r0 = r5.a()
            java.lang.String r1 = r5.a
            java.lang.String r2 = ""
            boolean r1 = r1.equals(r2)
            r3 = 0
            if (r1 != 0) goto L8a
            java.lang.String r1 = r5.f7617b
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L8a
            java.lang.String[] r1 = r5.f7618c
            int r1 = r1.length
            if (r1 <= 0) goto L8a
            java.lang.String r1 = r5.f7619d
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L8a
            java.lang.String r1 = r5.f7623h
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L8a
            java.lang.String r1 = r5.f7624i
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L8a
            javax.mail.Session r0 = javax.mail.Session.getInstance(r0, r5)
            javax.mail.internet.MimeMessage r1 = new javax.mail.internet.MimeMessage
            r1.<init>(r0)
            javax.mail.internet.InternetAddress r0 = new javax.mail.internet.InternetAddress
            java.lang.String r2 = r5.f7619d
            r0.<init>(r2)
            r1.setFrom(r0)
            java.lang.String[] r0 = r5.f7618c
            int r0 = r0.length
            javax.mail.internet.InternetAddress[] r0 = new javax.mail.internet.InternetAddress[r0]
        L4c:
            java.lang.String[] r2 = r5.f7618c
            int r2 = r2.length
            if (r3 >= r2) goto L5f
            javax.mail.internet.InternetAddress r2 = new javax.mail.internet.InternetAddress
            java.lang.String[] r4 = r5.f7618c
            r4 = r4[r3]
            r2.<init>(r4)
            r0[r3] = r2
            int r3 = r3 + 1
            goto L4c
        L5f:
            javax.mail.Message$RecipientType r2 = javax.mail.Message.RecipientType.TO
            r1.setRecipients(r2, r0)
            java.lang.String r0 = r5.f7623h
            r1.setSubject(r0)
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            r1.setSentDate(r0)
            javax.mail.internet.MimeBodyPart r0 = new javax.mail.internet.MimeBodyPart
            r0.<init>()
            java.lang.String r2 = r5.f7624i
            r0.setText(r2)
            javax.mail.Multipart r2 = r5.l
            r2.addBodyPart(r0)
            javax.mail.Multipart r0 = r5.l
            r1.setContent(r0)
            javax.mail.Transport.send(r1)
            r0 = 1
            return r0
        L8a:
            return r3
    }

    public void q(java.lang.String r1) {
            r0 = this;
            r0.f7624i = r1
            return
    }

    public void r(boolean r1) {
            r0 = this;
            r0.f7625j = r1
            return
    }

    public void s(java.lang.String r1) {
            r0 = this;
            r0.f7624i = r1
            return
    }

    public void t(boolean r1) {
            r0 = this;
            r0.f7626k = r1
            return
    }

    public void u(java.lang.String r1) {
            r0 = this;
            r0.f7619d = r1
            return
    }

    public void v(java.lang.String r1) {
            r0 = this;
            r0.f7622g = r1
            return
    }

    public void w(javax.mail.Multipart r1) {
            r0 = this;
            r0.l = r1
            return
    }

    public void x(java.lang.String r1) {
            r0 = this;
            r0.f7617b = r1
            return
    }

    public void y(java.lang.String r1) {
            r0 = this;
            r0.f7620e = r1
            return
    }

    public void z(java.lang.String r1) {
            r0 = this;
            r0.f7621f = r1
            return
    }
}
