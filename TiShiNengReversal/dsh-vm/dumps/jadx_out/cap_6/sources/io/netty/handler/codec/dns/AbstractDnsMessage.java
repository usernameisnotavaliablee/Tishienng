package io.netty.handler.codec.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class AbstractDnsMessage extends io.netty.util.AbstractReferenceCounted implements io.netty.handler.codec.dns.DnsMessage {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int SECTION_COUNT = 4;
    private static final int SECTION_QUESTION = 0;
    private static final io.netty.util.ResourceLeakDetector<io.netty.handler.codec.dns.DnsMessage> leakDetector = null;
    private java.lang.Object additionals;
    private java.lang.Object answers;
    private java.lang.Object authorities;
    private short id;
    private final io.netty.util.ResourceLeakTracker<io.netty.handler.codec.dns.DnsMessage> leak;
    private io.netty.handler.codec.dns.DnsOpCode opCode;
    private java.lang.Object questions;
    private boolean recursionDesired;
    private byte z;

    static {
            io.netty.util.ResourceLeakDetectorFactory r0 = io.netty.util.ResourceLeakDetectorFactory.instance()
            java.lang.Class<io.netty.handler.codec.dns.DnsMessage> r1 = io.netty.handler.codec.dns.DnsMessage.class
            io.netty.util.ResourceLeakDetector r0 = r0.newResourceLeakDetector(r1)
            io.netty.handler.codec.dns.AbstractDnsMessage.leakDetector = r0
            io.netty.handler.codec.dns.DnsSection r0 = io.netty.handler.codec.dns.DnsSection.QUESTION
            int r0 = r0.ordinal()
            io.netty.handler.codec.dns.AbstractDnsMessage.SECTION_QUESTION = r0
            return
    }

    protected AbstractDnsMessage(int r2) {
            r1 = this;
            io.netty.handler.codec.dns.DnsOpCode r0 = io.netty.handler.codec.dns.DnsOpCode.QUERY
            r1.<init>(r2, r0)
            return
    }

    protected AbstractDnsMessage(int r2, io.netty.handler.codec.dns.DnsOpCode r3) {
            r1 = this;
            r1.<init>()
            io.netty.util.ResourceLeakDetector<io.netty.handler.codec.dns.DnsMessage> r0 = io.netty.handler.codec.dns.AbstractDnsMessage.leakDetector
            io.netty.util.ResourceLeakTracker r0 = r0.track(r1)
            r1.leak = r0
            r1.setId(r2)
            r1.setOpCode(r3)
            return
    }

    private void addRecord(int r4, int r5, io.netty.handler.codec.dns.DnsRecord r6) {
            r3 = this;
            checkQuestion(r4, r6)
            java.lang.Object r0 = r3.sectionAt(r4)
            java.lang.String r1 = "index: "
            if (r0 != 0) goto L2b
            if (r5 != 0) goto L11
            r3.setSection(r4, r6)
            return
        L11:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            r6.append(r5)
            java.lang.String r5 = " (expected: 0)"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        L2b:
            boolean r2 = r0 instanceof io.netty.handler.codec.dns.DnsRecord
            if (r2 == 0) goto L6f
            if (r5 != 0) goto L40
            java.util.ArrayList r5 = newRecordList()
            r5.add(r6)
            io.netty.handler.codec.dns.DnsRecord r6 = castRecord(r0)
            r5.add(r6)
            goto L51
        L40:
            r2 = 1
            if (r5 != r2) goto L55
            java.util.ArrayList r5 = newRecordList()
            io.netty.handler.codec.dns.DnsRecord r0 = castRecord(r0)
            r5.add(r0)
            r5.add(r6)
        L51:
            r3.setSection(r4, r5)
            return
        L55:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            r6.append(r5)
            java.lang.String r5 = " (expected: 0 or 1)"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        L6f:
            java.util.List r0 = (java.util.List) r0
            r0.add(r5, r6)
            return
    }

    private void addRecord(int r3, io.netty.handler.codec.dns.DnsRecord r4) {
            r2 = this;
            checkQuestion(r3, r4)
            java.lang.Object r0 = r2.sectionAt(r3)
            if (r0 != 0) goto Ld
            r2.setSection(r3, r4)
            return
        Ld:
            boolean r1 = r0 instanceof io.netty.handler.codec.dns.DnsRecord
            if (r1 == 0) goto L23
            java.util.ArrayList r1 = newRecordList()
            io.netty.handler.codec.dns.DnsRecord r0 = castRecord(r0)
            r1.add(r0)
            r1.add(r4)
            r2.setSection(r3, r1)
            return
        L23:
            java.util.List r0 = (java.util.List) r0
            r0.add(r4)
            return
    }

    private static <T extends io.netty.handler.codec.dns.DnsRecord> T castRecord(java.lang.Object r0) {
            io.netty.handler.codec.dns.DnsRecord r0 = (io.netty.handler.codec.dns.DnsRecord) r0
            return r0
    }

    private static io.netty.handler.codec.dns.DnsRecord checkQuestion(int r2, io.netty.handler.codec.dns.DnsRecord r3) {
            int r0 = io.netty.handler.codec.dns.AbstractDnsMessage.SECTION_QUESTION
            if (r2 != r0) goto L39
            java.lang.String r2 = "record"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r2)
            boolean r2 = r2 instanceof io.netty.handler.codec.dns.DnsQuestion
            if (r2 == 0) goto Lf
            goto L39
        Lf:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "record: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " (expected: "
            r0.append(r3)
            java.lang.Class<io.netty.handler.codec.dns.DnsQuestion> r3 = io.netty.handler.codec.dns.DnsQuestion.class
            java.lang.String r3 = io.netty.util.internal.StringUtil.simpleClassName(r3)
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
        L39:
            return r3
    }

    private void clear(int r3) {
            r2 = this;
            java.lang.Object r0 = r2.sectionAt(r3)
            r1 = 0
            r2.setSection(r3, r1)
            boolean r3 = r0 instanceof io.netty.util.ReferenceCounted
            if (r3 == 0) goto L12
            io.netty.util.ReferenceCounted r0 = (io.netty.util.ReferenceCounted) r0
            r0.release()
            return
        L12:
            boolean r3 = r0 instanceof java.util.List
            if (r3 == 0) goto L30
            java.util.List r0 = (java.util.List) r0
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L30
            java.util.Iterator r3 = r0.iterator()
        L22:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r0 = r3.next()
            io.netty.util.ReferenceCountUtil.release(r0)
            goto L22
        L30:
            return
    }

    private int count(int r2) {
            r1 = this;
            java.lang.Object r2 = r1.sectionAt(r2)
            if (r2 != 0) goto L8
            r2 = 0
            return r2
        L8:
            boolean r0 = r2 instanceof io.netty.handler.codec.dns.DnsRecord
            if (r0 == 0) goto Le
            r2 = 1
            return r2
        Le:
            java.util.List r2 = (java.util.List) r2
            int r2 = r2.size()
            return r2
    }

    private static java.util.ArrayList<io.netty.handler.codec.dns.DnsRecord> newRecordList() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            return r0
    }

    private <T extends io.netty.handler.codec.dns.DnsRecord> T recordAt(int r3) {
            r2 = this;
            java.lang.Object r3 = r2.sectionAt(r3)
            r0 = 0
            if (r3 != 0) goto L8
            return r0
        L8:
            boolean r1 = r3 instanceof io.netty.handler.codec.dns.DnsRecord
            if (r1 == 0) goto L11
            io.netty.handler.codec.dns.DnsRecord r3 = castRecord(r3)
            return r3
        L11:
            java.util.List r3 = (java.util.List) r3
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L1a
            return r0
        L1a:
            r0 = 0
            java.lang.Object r3 = r3.get(r0)
            io.netty.handler.codec.dns.DnsRecord r3 = castRecord(r3)
            return r3
    }

    private <T extends io.netty.handler.codec.dns.DnsRecord> T recordAt(int r3, int r4) {
            r2 = this;
            java.lang.Object r3 = r2.sectionAt(r3)
            java.lang.String r0 = "index: "
            if (r3 == 0) goto L38
            boolean r1 = r3 instanceof io.netty.handler.codec.dns.DnsRecord
            if (r1 == 0) goto L2d
            if (r4 != 0) goto L13
            io.netty.handler.codec.dns.DnsRecord r3 = castRecord(r3)
            return r3
        L13:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r4)
            java.lang.String r4 = "' (expected: 0)"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r3.<init>(r4)
            throw r3
        L2d:
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r3.get(r4)
            io.netty.handler.codec.dns.DnsRecord r3 = castRecord(r3)
            return r3
        L38:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r4)
            java.lang.String r4 = " (expected: none)"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r3.<init>(r4)
            throw r3
    }

    private <T extends io.netty.handler.codec.dns.DnsRecord> T removeRecord(int r4, int r5) {
            r3 = this;
            java.lang.Object r0 = r3.sectionAt(r4)
            java.lang.String r1 = "index: "
            if (r0 == 0) goto L3c
            boolean r2 = r0 instanceof io.netty.handler.codec.dns.DnsRecord
            if (r2 == 0) goto L31
            if (r5 != 0) goto L17
            io.netty.handler.codec.dns.DnsRecord r5 = castRecord(r0)
            r0 = 0
            r3.setSection(r4, r0)
            return r5
        L17:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = " (expected: 0)"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
        L31:
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r4 = r0.remove(r5)
            io.netty.handler.codec.dns.DnsRecord r4 = castRecord(r4)
            return r4
        L3c:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = " (expected: none)"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
    }

    private java.lang.Object sectionAt(int r2) {
            r1 = this;
            if (r2 == 0) goto L1a
            r0 = 1
            if (r2 == r0) goto L17
            r0 = 2
            if (r2 == r0) goto L14
            r0 = 3
            if (r2 != r0) goto Le
            java.lang.Object r2 = r1.additionals
            return r2
        Le:
            java.lang.Error r2 = new java.lang.Error
            r2.<init>()
            throw r2
        L14:
            java.lang.Object r2 = r1.authorities
            return r2
        L17:
            java.lang.Object r2 = r1.answers
            return r2
        L1a:
            java.lang.Object r2 = r1.questions
            return r2
    }

    private static int sectionOrdinal(io.netty.handler.codec.dns.DnsSection r1) {
            java.lang.String r0 = "section"
            java.lang.Object r1 = io.netty.util.internal.ObjectUtil.checkNotNull(r1, r0)
            io.netty.handler.codec.dns.DnsSection r1 = (io.netty.handler.codec.dns.DnsSection) r1
            int r1 = r1.ordinal()
            return r1
    }

    private <T extends io.netty.handler.codec.dns.DnsRecord> T setRecord(int r4, int r5, io.netty.handler.codec.dns.DnsRecord r6) {
            r3 = this;
            checkQuestion(r4, r6)
            java.lang.Object r0 = r3.sectionAt(r4)
            java.lang.String r1 = "index: "
            if (r0 == 0) goto L3e
            boolean r2 = r0 instanceof io.netty.handler.codec.dns.DnsRecord
            if (r2 == 0) goto L33
            if (r5 != 0) goto L19
            r3.setSection(r4, r6)
            io.netty.handler.codec.dns.DnsRecord r4 = castRecord(r0)
            return r4
        L19:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            r6.append(r5)
            java.lang.String r5 = " (expected: 0)"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        L33:
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r4 = r0.set(r5, r6)
            io.netty.handler.codec.dns.DnsRecord r4 = castRecord(r4)
            return r4
        L3e:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            r6.append(r5)
            java.lang.String r5 = " (expected: none)"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
    }

    private void setRecord(int r1, io.netty.handler.codec.dns.DnsRecord r2) {
            r0 = this;
            r0.clear(r1)
            io.netty.handler.codec.dns.DnsRecord r2 = checkQuestion(r1, r2)
            r0.setSection(r1, r2)
            return
    }

    private void setSection(int r2, java.lang.Object r3) {
            r1 = this;
            if (r2 == 0) goto L1a
            r0 = 1
            if (r2 == r0) goto L17
            r0 = 2
            if (r2 == r0) goto L14
            r0 = 3
            if (r2 != r0) goto Le
            r1.additionals = r3
            return
        Le:
            java.lang.Error r2 = new java.lang.Error
            r2.<init>()
            throw r2
        L14:
            r1.authorities = r3
            return
        L17:
            r1.answers = r3
            return
        L1a:
            r1.questions = r3
            return
    }

    @Override // io.netty.handler.codec.dns.DnsMessage
    public io.netty.handler.codec.dns.DnsMessage addRecord(io.netty.handler.codec.dns.DnsSection r1, int r2, io.netty.handler.codec.dns.DnsRecord r3) {
            r0 = this;
            int r1 = sectionOrdinal(r1)
            r0.addRecord(r1, r2, r3)
            return r0
    }

    @Override // io.netty.handler.codec.dns.DnsMessage
    public io.netty.handler.codec.dns.DnsMessage addRecord(io.netty.handler.codec.dns.DnsSection r1, io.netty.handler.codec.dns.DnsRecord r2) {
            r0 = this;
            int r1 = sectionOrdinal(r1)
            r0.addRecord(r1, r2)
            return r0
    }

    @Override // io.netty.handler.codec.dns.DnsMessage
    public io.netty.handler.codec.dns.DnsMessage clear() {
            r2 = this;
            r0 = 0
        L1:
            r1 = 4
            if (r0 >= r1) goto La
            r2.clear(r0)
            int r0 = r0 + 1
            goto L1
        La:
            return r2
    }

    @Override // io.netty.handler.codec.dns.DnsMessage
    public io.netty.handler.codec.dns.DnsMessage clear(io.netty.handler.codec.dns.DnsSection r1) {
            r0 = this;
            int r1 = sectionOrdinal(r1)
            r0.clear(r1)
            return r0
    }

    @Override // io.netty.handler.codec.dns.DnsMessage
    public int count() {
            r3 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 4
            if (r0 >= r2) goto Ld
            int r2 = r3.count(r0)
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L2
        Ld:
            return r1
    }

    @Override // io.netty.handler.codec.dns.DnsMessage
    public int count(io.netty.handler.codec.dns.DnsSection r1) {
            r0 = this;
            int r1 = sectionOrdinal(r1)
            int r1 = r0.count(r1)
            return r1
    }

    protected void deallocate() {
            r1 = this;
            r1.clear()
            io.netty.util.ResourceLeakTracker<io.netty.handler.codec.dns.DnsMessage> r0 = r1.leak
            if (r0 == 0) goto La
            r0.close(r1)
        La:
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof io.netty.handler.codec.dns.DnsMessage
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            io.netty.handler.codec.dns.DnsMessage r5 = (io.netty.handler.codec.dns.DnsMessage) r5
            int r1 = r4.id()
            int r3 = r5.id()
            if (r1 == r3) goto L17
            return r2
        L17:
            boolean r1 = r4 instanceof io.netty.handler.codec.dns.DnsQuery
            if (r1 == 0) goto L20
            boolean r5 = r5 instanceof io.netty.handler.codec.dns.DnsQuery
            if (r5 != 0) goto L25
            return r2
        L20:
            boolean r5 = r5 instanceof io.netty.handler.codec.dns.DnsQuery
            if (r5 == 0) goto L25
            return r2
        L25:
            return r0
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.id()
            int r0 = r0 * 31
            boolean r1 = r2 instanceof io.netty.handler.codec.dns.DnsQuery
            r1 = r1 ^ 1
            int r0 = r0 + r1
            return r0
    }

    @Override // io.netty.handler.codec.dns.DnsMessage
    public int id() {
            r2 = this;
            short r0 = r2.id
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            return r0
    }

    @Override // io.netty.handler.codec.dns.DnsMessage
    public boolean isRecursionDesired() {
            r1 = this;
            boolean r0 = r1.recursionDesired
            return r0
    }

    @Override // io.netty.handler.codec.dns.DnsMessage
    public io.netty.handler.codec.dns.DnsOpCode opCode() {
            r1 = this;
            io.netty.handler.codec.dns.DnsOpCode r0 = r1.opCode
            return r0
    }

    @Override // io.netty.handler.codec.dns.DnsMessage
    public <T extends io.netty.handler.codec.dns.DnsRecord> T recordAt(io.netty.handler.codec.dns.DnsSection r1) {
            r0 = this;
            int r1 = sectionOrdinal(r1)
            io.netty.handler.codec.dns.DnsRecord r1 = r0.recordAt(r1)
            return r1
    }

    @Override // io.netty.handler.codec.dns.DnsMessage
    public <T extends io.netty.handler.codec.dns.DnsRecord> T recordAt(io.netty.handler.codec.dns.DnsSection r1, int r2) {
            r0 = this;
            int r1 = sectionOrdinal(r1)
            io.netty.handler.codec.dns.DnsRecord r1 = r0.recordAt(r1, r2)
            return r1
    }

    @Override // io.netty.handler.codec.dns.DnsMessage
    public <T extends io.netty.handler.codec.dns.DnsRecord> T removeRecord(io.netty.handler.codec.dns.DnsSection r1, int r2) {
            r0 = this;
            int r1 = sectionOrdinal(r1)
            io.netty.handler.codec.dns.DnsRecord r1 = r0.removeRecord(r1, r2)
            return r1
    }

    @Override // io.netty.handler.codec.dns.DnsMessage
    public io.netty.handler.codec.dns.DnsMessage retain() {
            r1 = this;
            io.netty.util.ReferenceCounted r0 = super.retain()
            io.netty.handler.codec.dns.DnsMessage r0 = (io.netty.handler.codec.dns.DnsMessage) r0
            return r0
    }

    @Override // io.netty.handler.codec.dns.DnsMessage
    public io.netty.handler.codec.dns.DnsMessage retain(int r1) {
            r0 = this;
            io.netty.util.ReferenceCounted r1 = super.retain(r1)
            io.netty.handler.codec.dns.DnsMessage r1 = (io.netty.handler.codec.dns.DnsMessage) r1
            return r1
    }

    /* renamed from: retain, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo179retain() {
            r1 = this;
            io.netty.handler.codec.dns.DnsMessage r0 = r1.retain()
            return r0
    }

    /* renamed from: retain, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo180retain(int r1) {
            r0 = this;
            io.netty.handler.codec.dns.DnsMessage r1 = r0.retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.dns.DnsMessage
    public io.netty.handler.codec.dns.DnsMessage setId(int r1) {
            r0 = this;
            short r1 = (short) r1
            r0.id = r1
            return r0
    }

    @Override // io.netty.handler.codec.dns.DnsMessage
    public io.netty.handler.codec.dns.DnsMessage setOpCode(io.netty.handler.codec.dns.DnsOpCode r2) {
            r1 = this;
            java.lang.String r0 = "opCode"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.codec.dns.DnsOpCode r2 = (io.netty.handler.codec.dns.DnsOpCode) r2
            r1.opCode = r2
            return r1
    }

    @Override // io.netty.handler.codec.dns.DnsMessage
    public io.netty.handler.codec.dns.DnsMessage setRecord(io.netty.handler.codec.dns.DnsSection r1, io.netty.handler.codec.dns.DnsRecord r2) {
            r0 = this;
            int r1 = sectionOrdinal(r1)
            r0.setRecord(r1, r2)
            return r0
    }

    @Override // io.netty.handler.codec.dns.DnsMessage
    public <T extends io.netty.handler.codec.dns.DnsRecord> T setRecord(io.netty.handler.codec.dns.DnsSection r1, int r2, io.netty.handler.codec.dns.DnsRecord r3) {
            r0 = this;
            int r1 = sectionOrdinal(r1)
            io.netty.handler.codec.dns.DnsRecord r1 = r0.setRecord(r1, r2, r3)
            return r1
    }

    @Override // io.netty.handler.codec.dns.DnsMessage
    public io.netty.handler.codec.dns.DnsMessage setRecursionDesired(boolean r1) {
            r0 = this;
            r0.recursionDesired = r1
            return r0
    }

    @Override // io.netty.handler.codec.dns.DnsMessage
    public io.netty.handler.codec.dns.DnsMessage setZ(int r1) {
            r0 = this;
            r1 = r1 & 7
            byte r1 = (byte) r1
            r0.z = r1
            return r0
    }

    @Override // io.netty.handler.codec.dns.DnsMessage
    public io.netty.handler.codec.dns.DnsMessage touch() {
            r1 = this;
            io.netty.util.ReferenceCounted r0 = super.touch()
            io.netty.handler.codec.dns.DnsMessage r0 = (io.netty.handler.codec.dns.DnsMessage) r0
            return r0
    }

    @Override // io.netty.handler.codec.dns.DnsMessage
    public io.netty.handler.codec.dns.DnsMessage touch(java.lang.Object r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.handler.codec.dns.DnsMessage> r0 = r1.leak
            if (r0 == 0) goto L7
            r0.record(r2)
        L7:
            return r1
    }

    /* renamed from: touch, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo181touch() {
            r1 = this;
            io.netty.handler.codec.dns.DnsMessage r0 = r1.touch()
            return r0
    }

    /* renamed from: touch, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo182touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.dns.DnsMessage r1 = r0.touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.dns.DnsMessage
    public int z() {
            r1 = this;
            byte r0 = r1.z
            return r0
    }
}
