package org.apache.commons.net.imap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class IMAPClient extends org.apache.commons.net.imap.IMAP {
    private static final char E = '\"';
    private static final java.lang.String F = "\"";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum FETCH_ITEM_NAMES extends java.lang.Enum<org.apache.commons.net.imap.IMAPClient.FETCH_ITEM_NAMES> {
        private static final /* synthetic */ org.apache.commons.net.imap.IMAPClient.FETCH_ITEM_NAMES[] $VALUES = null;
        public static final org.apache.commons.net.imap.IMAPClient.FETCH_ITEM_NAMES ALL = null;
        public static final org.apache.commons.net.imap.IMAPClient.FETCH_ITEM_NAMES BODY = null;
        public static final org.apache.commons.net.imap.IMAPClient.FETCH_ITEM_NAMES BODYSTRUCTURE = null;
        public static final org.apache.commons.net.imap.IMAPClient.FETCH_ITEM_NAMES ENVELOPE = null;
        public static final org.apache.commons.net.imap.IMAPClient.FETCH_ITEM_NAMES FAST = null;
        public static final org.apache.commons.net.imap.IMAPClient.FETCH_ITEM_NAMES FLAGS = null;
        public static final org.apache.commons.net.imap.IMAPClient.FETCH_ITEM_NAMES FULL = null;
        public static final org.apache.commons.net.imap.IMAPClient.FETCH_ITEM_NAMES INTERNALDATE = null;
        public static final org.apache.commons.net.imap.IMAPClient.FETCH_ITEM_NAMES RFC822 = null;
        public static final org.apache.commons.net.imap.IMAPClient.FETCH_ITEM_NAMES UID = null;

        static {
                org.apache.commons.net.imap.IMAPClient$FETCH_ITEM_NAMES r0 = new org.apache.commons.net.imap.IMAPClient$FETCH_ITEM_NAMES
                java.lang.String r1 = "ALL"
                r2 = 0
                r0.<init>(r1, r2)
                org.apache.commons.net.imap.IMAPClient.FETCH_ITEM_NAMES.ALL = r0
                org.apache.commons.net.imap.IMAPClient$FETCH_ITEM_NAMES r1 = new org.apache.commons.net.imap.IMAPClient$FETCH_ITEM_NAMES
                java.lang.String r3 = "FAST"
                r4 = 1
                r1.<init>(r3, r4)
                org.apache.commons.net.imap.IMAPClient.FETCH_ITEM_NAMES.FAST = r1
                org.apache.commons.net.imap.IMAPClient$FETCH_ITEM_NAMES r3 = new org.apache.commons.net.imap.IMAPClient$FETCH_ITEM_NAMES
                java.lang.String r5 = "FULL"
                r6 = 2
                r3.<init>(r5, r6)
                org.apache.commons.net.imap.IMAPClient.FETCH_ITEM_NAMES.FULL = r3
                org.apache.commons.net.imap.IMAPClient$FETCH_ITEM_NAMES r5 = new org.apache.commons.net.imap.IMAPClient$FETCH_ITEM_NAMES
                java.lang.String r7 = "BODY"
                r8 = 3
                r5.<init>(r7, r8)
                org.apache.commons.net.imap.IMAPClient.FETCH_ITEM_NAMES.BODY = r5
                org.apache.commons.net.imap.IMAPClient$FETCH_ITEM_NAMES r7 = new org.apache.commons.net.imap.IMAPClient$FETCH_ITEM_NAMES
                java.lang.String r9 = "BODYSTRUCTURE"
                r10 = 4
                r7.<init>(r9, r10)
                org.apache.commons.net.imap.IMAPClient.FETCH_ITEM_NAMES.BODYSTRUCTURE = r7
                org.apache.commons.net.imap.IMAPClient$FETCH_ITEM_NAMES r9 = new org.apache.commons.net.imap.IMAPClient$FETCH_ITEM_NAMES
                java.lang.String r11 = "ENVELOPE"
                r12 = 5
                r9.<init>(r11, r12)
                org.apache.commons.net.imap.IMAPClient.FETCH_ITEM_NAMES.ENVELOPE = r9
                org.apache.commons.net.imap.IMAPClient$FETCH_ITEM_NAMES r11 = new org.apache.commons.net.imap.IMAPClient$FETCH_ITEM_NAMES
                java.lang.String r13 = "FLAGS"
                r14 = 6
                r11.<init>(r13, r14)
                org.apache.commons.net.imap.IMAPClient.FETCH_ITEM_NAMES.FLAGS = r11
                org.apache.commons.net.imap.IMAPClient$FETCH_ITEM_NAMES r13 = new org.apache.commons.net.imap.IMAPClient$FETCH_ITEM_NAMES
                java.lang.String r15 = "INTERNALDATE"
                r16 = 0
                r2 = 7
                r13.<init>(r15, r2)
                org.apache.commons.net.imap.IMAPClient.FETCH_ITEM_NAMES.INTERNALDATE = r13
                org.apache.commons.net.imap.IMAPClient$FETCH_ITEM_NAMES r15 = new org.apache.commons.net.imap.IMAPClient$FETCH_ITEM_NAMES
                r17 = 7
                java.lang.String r2 = "RFC822"
                r18 = 1
                r4 = 8
                r15.<init>(r2, r4)
                org.apache.commons.net.imap.IMAPClient.FETCH_ITEM_NAMES.RFC822 = r15
                org.apache.commons.net.imap.IMAPClient$FETCH_ITEM_NAMES r2 = new org.apache.commons.net.imap.IMAPClient$FETCH_ITEM_NAMES
                r19 = 8
                java.lang.String r4 = "UID"
                r20 = 2
                r6 = 9
                r2.<init>(r4, r6)
                org.apache.commons.net.imap.IMAPClient.FETCH_ITEM_NAMES.UID = r2
                r4 = 10
                org.apache.commons.net.imap.IMAPClient$FETCH_ITEM_NAMES[] r4 = new org.apache.commons.net.imap.IMAPClient.FETCH_ITEM_NAMES[r4]
                r4[r16] = r0
                r4[r18] = r1
                r4[r20] = r3
                r4[r8] = r5
                r4[r10] = r7
                r4[r12] = r9
                r4[r14] = r11
                r4[r17] = r13
                r4[r19] = r15
                r4[r6] = r2
                org.apache.commons.net.imap.IMAPClient.FETCH_ITEM_NAMES.$VALUES = r4
                return
        }

        FETCH_ITEM_NAMES(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.apache.commons.net.imap.IMAPClient.FETCH_ITEM_NAMES valueOf(java.lang.String r1) {
                java.lang.Class<org.apache.commons.net.imap.IMAPClient$FETCH_ITEM_NAMES> r0 = org.apache.commons.net.imap.IMAPClient.FETCH_ITEM_NAMES.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.apache.commons.net.imap.IMAPClient$FETCH_ITEM_NAMES r1 = (org.apache.commons.net.imap.IMAPClient.FETCH_ITEM_NAMES) r1
                return r1
        }

        public static org.apache.commons.net.imap.IMAPClient.FETCH_ITEM_NAMES[] values() {
                org.apache.commons.net.imap.IMAPClient$FETCH_ITEM_NAMES[] r0 = org.apache.commons.net.imap.IMAPClient.FETCH_ITEM_NAMES.$VALUES
                java.lang.Object r0 = r0.clone()
                org.apache.commons.net.imap.IMAPClient$FETCH_ITEM_NAMES[] r0 = (org.apache.commons.net.imap.IMAPClient.FETCH_ITEM_NAMES[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum SEARCH_CRITERIA extends java.lang.Enum<org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA> {
        private static final /* synthetic */ org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA[] $VALUES = null;
        public static final org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA ALL = null;
        public static final org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA ANSWERED = null;
        public static final org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA BCC = null;
        public static final org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA BEFORE = null;
        public static final org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA BODY = null;
        public static final org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA CC = null;
        public static final org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA DELETED = null;
        public static final org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA DRAFT = null;
        public static final org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA FLAGGED = null;
        public static final org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA FROM = null;
        public static final org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA HEADER = null;
        public static final org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA KEYWORD = null;
        public static final org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA LARGER = null;
        public static final org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA NEW = null;
        public static final org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA NOT = null;
        public static final org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA OLD = null;
        public static final org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA ON = null;
        public static final org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA OR = null;
        public static final org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA RECENT = null;
        public static final org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA SEEN = null;
        public static final org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA SENTBEFORE = null;
        public static final org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA SENTON = null;
        public static final org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA SENTSINCE = null;
        public static final org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA SINCE = null;
        public static final org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA SMALLER = null;
        public static final org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA SUBJECT = null;
        public static final org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA TEXT = null;
        public static final org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA TO = null;
        public static final org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA UID = null;
        public static final org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA UNANSWERED = null;
        public static final org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA UNDELETED = null;
        public static final org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA UNDRAFT = null;
        public static final org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA UNFLAGGED = null;
        public static final org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA UNKEYWORD = null;
        public static final org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA UNSEEN = null;

        static {
                org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA r0 = new org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA
                java.lang.String r1 = "ALL"
                r2 = 0
                r0.<init>(r1, r2)
                org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA.ALL = r0
                org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA r1 = new org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA
                java.lang.String r3 = "ANSWERED"
                r4 = 1
                r1.<init>(r3, r4)
                org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA.ANSWERED = r1
                org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA r3 = new org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA
                java.lang.String r5 = "BCC"
                r6 = 2
                r3.<init>(r5, r6)
                org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA.BCC = r3
                org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA r5 = new org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA
                java.lang.String r7 = "BEFORE"
                r8 = 3
                r5.<init>(r7, r8)
                org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA.BEFORE = r5
                org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA r7 = new org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA
                java.lang.String r9 = "BODY"
                r10 = 4
                r7.<init>(r9, r10)
                org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA.BODY = r7
                org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA r9 = new org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA
                java.lang.String r11 = "CC"
                r12 = 5
                r9.<init>(r11, r12)
                org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA.CC = r9
                org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA r11 = new org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA
                java.lang.String r13 = "DELETED"
                r14 = 6
                r11.<init>(r13, r14)
                org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA.DELETED = r11
                org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA r13 = new org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA
                java.lang.String r15 = "DRAFT"
                r16 = 0
                r2 = 7
                r13.<init>(r15, r2)
                org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA.DRAFT = r13
                org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA r15 = new org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA
                r17 = 7
                java.lang.String r2 = "FLAGGED"
                r18 = 1
                r4 = 8
                r15.<init>(r2, r4)
                org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA.FLAGGED = r15
                org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA r2 = new org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA
                r19 = 8
                java.lang.String r4 = "FROM"
                r20 = 2
                r6 = 9
                r2.<init>(r4, r6)
                org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA.FROM = r2
                org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA r4 = new org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA
                r21 = 9
                java.lang.String r6 = "HEADER"
                r22 = 3
                r8 = 10
                r4.<init>(r6, r8)
                org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA.HEADER = r4
                org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA r6 = new org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA
                r23 = 10
                java.lang.String r8 = "KEYWORD"
                r24 = 4
                r10 = 11
                r6.<init>(r8, r10)
                org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA.KEYWORD = r6
                org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA r8 = new org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA
                r25 = 11
                java.lang.String r10 = "LARGER"
                r26 = 5
                r12 = 12
                r8.<init>(r10, r12)
                org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA.LARGER = r8
                org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA r10 = new org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA
                r27 = 12
                java.lang.String r12 = "NEW"
                r28 = 6
                r14 = 13
                r10.<init>(r12, r14)
                org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA.NEW = r10
                org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA r12 = new org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA
                r29 = 13
                java.lang.String r14 = "NOT"
                r30 = r0
                r0 = 14
                r12.<init>(r14, r0)
                org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA.NOT = r12
                org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA r14 = new org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA
                r31 = 14
                java.lang.String r0 = "OLD"
                r32 = r1
                r1 = 15
                r14.<init>(r0, r1)
                org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA.OLD = r14
                org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA r0 = new org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA
                r33 = 15
                java.lang.String r1 = "ON"
                r34 = r2
                r2 = 16
                r0.<init>(r1, r2)
                org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA.ON = r0
                org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA r1 = new org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA
                r35 = 16
                java.lang.String r2 = "OR"
                r36 = r0
                r0 = 17
                r1.<init>(r2, r0)
                org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA.OR = r1
                org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA r2 = new org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA
                r37 = 17
                java.lang.String r0 = "RECENT"
                r38 = r1
                r1 = 18
                r2.<init>(r0, r1)
                org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA.RECENT = r2
                org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA r0 = new org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA
                r39 = 18
                java.lang.String r1 = "SEEN"
                r40 = r2
                r2 = 19
                r0.<init>(r1, r2)
                org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA.SEEN = r0
                org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA r1 = new org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA
                r41 = 19
                java.lang.String r2 = "SENTBEFORE"
                r42 = r0
                r0 = 20
                r1.<init>(r2, r0)
                org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA.SENTBEFORE = r1
                org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA r2 = new org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA
                r43 = 20
                java.lang.String r0 = "SENTON"
                r44 = r1
                r1 = 21
                r2.<init>(r0, r1)
                org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA.SENTON = r2
                org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA r0 = new org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA
                r45 = 21
                java.lang.String r1 = "SENTSINCE"
                r46 = r2
                r2 = 22
                r0.<init>(r1, r2)
                org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA.SENTSINCE = r0
                org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA r1 = new org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA
                java.lang.String r2 = "SINCE"
                r47 = r0
                r0 = 23
                r1.<init>(r2, r0)
                org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA.SINCE = r1
                org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA r0 = new org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA
                java.lang.String r2 = "SMALLER"
                r48 = r1
                r1 = 24
                r0.<init>(r2, r1)
                org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA.SMALLER = r0
                org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA r1 = new org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA
                java.lang.String r2 = "SUBJECT"
                r49 = r0
                r0 = 25
                r1.<init>(r2, r0)
                org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA.SUBJECT = r1
                org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA r0 = new org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA
                java.lang.String r2 = "TEXT"
                r50 = r1
                r1 = 26
                r0.<init>(r2, r1)
                org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA.TEXT = r0
                org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA r1 = new org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA
                java.lang.String r2 = "TO"
                r51 = r0
                r0 = 27
                r1.<init>(r2, r0)
                org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA.TO = r1
                org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA r0 = new org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA
                java.lang.String r2 = "UID"
                r52 = r1
                r1 = 28
                r0.<init>(r2, r1)
                org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA.UID = r0
                org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA r1 = new org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA
                java.lang.String r2 = "UNANSWERED"
                r53 = r0
                r0 = 29
                r1.<init>(r2, r0)
                org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA.UNANSWERED = r1
                org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA r0 = new org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA
                java.lang.String r2 = "UNDELETED"
                r54 = r1
                r1 = 30
                r0.<init>(r2, r1)
                org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA.UNDELETED = r0
                org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA r1 = new org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA
                java.lang.String r2 = "UNDRAFT"
                r55 = r0
                r0 = 31
                r1.<init>(r2, r0)
                org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA.UNDRAFT = r1
                org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA r0 = new org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA
                java.lang.String r2 = "UNFLAGGED"
                r56 = r1
                r1 = 32
                r0.<init>(r2, r1)
                org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA.UNFLAGGED = r0
                org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA r1 = new org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA
                java.lang.String r2 = "UNKEYWORD"
                r57 = r0
                r0 = 33
                r1.<init>(r2, r0)
                org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA.UNKEYWORD = r1
                org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA r0 = new org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA
                java.lang.String r2 = "UNSEEN"
                r58 = r1
                r1 = 34
                r0.<init>(r2, r1)
                org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA.UNSEEN = r0
                r1 = 35
                org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA[] r1 = new org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA[r1]
                r1[r16] = r30
                r1[r18] = r32
                r1[r20] = r3
                r1[r22] = r5
                r1[r24] = r7
                r1[r26] = r9
                r1[r28] = r11
                r1[r17] = r13
                r1[r19] = r15
                r1[r21] = r34
                r1[r23] = r4
                r1[r25] = r6
                r1[r27] = r8
                r1[r29] = r10
                r1[r31] = r12
                r1[r33] = r14
                r1[r35] = r36
                r1[r37] = r38
                r1[r39] = r40
                r1[r41] = r42
                r1[r43] = r44
                r1[r45] = r46
                r2 = 22
                r1[r2] = r47
                r2 = 23
                r1[r2] = r48
                r2 = 24
                r1[r2] = r49
                r2 = 25
                r1[r2] = r50
                r2 = 26
                r1[r2] = r51
                r2 = 27
                r1[r2] = r52
                r2 = 28
                r1[r2] = r53
                r2 = 29
                r1[r2] = r54
                r2 = 30
                r1[r2] = r55
                r2 = 31
                r1[r2] = r56
                r2 = 32
                r1[r2] = r57
                r2 = 33
                r1[r2] = r58
                r2 = 34
                r1[r2] = r0
                org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA.$VALUES = r1
                return
        }

        SEARCH_CRITERIA(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA valueOf(java.lang.String r1) {
                java.lang.Class<org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA> r0 = org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA r1 = (org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA) r1
                return r1
        }

        public static org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA[] values() {
                org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA[] r0 = org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA.$VALUES
                java.lang.Object r0 = r0.clone()
                org.apache.commons.net.imap.IMAPClient$SEARCH_CRITERIA[] r0 = (org.apache.commons.net.imap.IMAPClient.SEARCH_CRITERIA[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum STATUS_DATA_ITEMS extends java.lang.Enum<org.apache.commons.net.imap.IMAPClient.STATUS_DATA_ITEMS> {
        private static final /* synthetic */ org.apache.commons.net.imap.IMAPClient.STATUS_DATA_ITEMS[] $VALUES = null;
        public static final org.apache.commons.net.imap.IMAPClient.STATUS_DATA_ITEMS MESSAGES = null;
        public static final org.apache.commons.net.imap.IMAPClient.STATUS_DATA_ITEMS RECENT = null;
        public static final org.apache.commons.net.imap.IMAPClient.STATUS_DATA_ITEMS UIDNEXT = null;
        public static final org.apache.commons.net.imap.IMAPClient.STATUS_DATA_ITEMS UIDVALIDITY = null;
        public static final org.apache.commons.net.imap.IMAPClient.STATUS_DATA_ITEMS UNSEEN = null;

        static {
                org.apache.commons.net.imap.IMAPClient$STATUS_DATA_ITEMS r0 = new org.apache.commons.net.imap.IMAPClient$STATUS_DATA_ITEMS
                java.lang.String r1 = "MESSAGES"
                r2 = 0
                r0.<init>(r1, r2)
                org.apache.commons.net.imap.IMAPClient.STATUS_DATA_ITEMS.MESSAGES = r0
                org.apache.commons.net.imap.IMAPClient$STATUS_DATA_ITEMS r1 = new org.apache.commons.net.imap.IMAPClient$STATUS_DATA_ITEMS
                java.lang.String r3 = "RECENT"
                r4 = 1
                r1.<init>(r3, r4)
                org.apache.commons.net.imap.IMAPClient.STATUS_DATA_ITEMS.RECENT = r1
                org.apache.commons.net.imap.IMAPClient$STATUS_DATA_ITEMS r3 = new org.apache.commons.net.imap.IMAPClient$STATUS_DATA_ITEMS
                java.lang.String r5 = "UIDNEXT"
                r6 = 2
                r3.<init>(r5, r6)
                org.apache.commons.net.imap.IMAPClient.STATUS_DATA_ITEMS.UIDNEXT = r3
                org.apache.commons.net.imap.IMAPClient$STATUS_DATA_ITEMS r5 = new org.apache.commons.net.imap.IMAPClient$STATUS_DATA_ITEMS
                java.lang.String r7 = "UIDVALIDITY"
                r8 = 3
                r5.<init>(r7, r8)
                org.apache.commons.net.imap.IMAPClient.STATUS_DATA_ITEMS.UIDVALIDITY = r5
                org.apache.commons.net.imap.IMAPClient$STATUS_DATA_ITEMS r7 = new org.apache.commons.net.imap.IMAPClient$STATUS_DATA_ITEMS
                java.lang.String r9 = "UNSEEN"
                r10 = 4
                r7.<init>(r9, r10)
                org.apache.commons.net.imap.IMAPClient.STATUS_DATA_ITEMS.UNSEEN = r7
                r9 = 5
                org.apache.commons.net.imap.IMAPClient$STATUS_DATA_ITEMS[] r9 = new org.apache.commons.net.imap.IMAPClient.STATUS_DATA_ITEMS[r9]
                r9[r2] = r0
                r9[r4] = r1
                r9[r6] = r3
                r9[r8] = r5
                r9[r10] = r7
                org.apache.commons.net.imap.IMAPClient.STATUS_DATA_ITEMS.$VALUES = r9
                return
        }

        STATUS_DATA_ITEMS(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.apache.commons.net.imap.IMAPClient.STATUS_DATA_ITEMS valueOf(java.lang.String r1) {
                java.lang.Class<org.apache.commons.net.imap.IMAPClient$STATUS_DATA_ITEMS> r0 = org.apache.commons.net.imap.IMAPClient.STATUS_DATA_ITEMS.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.apache.commons.net.imap.IMAPClient$STATUS_DATA_ITEMS r1 = (org.apache.commons.net.imap.IMAPClient.STATUS_DATA_ITEMS) r1
                return r1
        }

        public static org.apache.commons.net.imap.IMAPClient.STATUS_DATA_ITEMS[] values() {
                org.apache.commons.net.imap.IMAPClient$STATUS_DATA_ITEMS[] r0 = org.apache.commons.net.imap.IMAPClient.STATUS_DATA_ITEMS.$VALUES
                java.lang.Object r0 = r0.clone()
                org.apache.commons.net.imap.IMAPClient$STATUS_DATA_ITEMS[] r0 = (org.apache.commons.net.imap.IMAPClient.STATUS_DATA_ITEMS[]) r0
                return r0
        }
    }

    public IMAPClient() {
            r0 = this;
            r0.<init>()
            return
    }

    public boolean A0(java.lang.String r3, java.lang.String r4) throws java.io.IOException {
            r2 = this;
            org.apache.commons.net.imap.IMAPCommand r0 = org.apache.commons.net.imap.IMAPCommand.LIST
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = " "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            boolean r3 = r2.c0(r0, r3)
            return r3
    }

    public boolean B0(java.lang.String r4, java.lang.String r5) throws java.io.IOException {
            r3 = this;
            org.apache.commons.net.imap.IMAP$IMAPState r0 = r3.g0()
            org.apache.commons.net.imap.IMAP$IMAPState r1 = org.apache.commons.net.imap.IMAP.IMAPState.NOT_AUTH_STATE
            r2 = 0
            if (r0 == r1) goto La
            return r2
        La:
            org.apache.commons.net.imap.IMAPCommand r0 = org.apache.commons.net.imap.IMAPCommand.LOGIN
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r4 = " "
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
            boolean r4 = r3.c0(r0, r4)
            if (r4 != 0) goto L27
            return r2
        L27:
            org.apache.commons.net.imap.IMAP$IMAPState r4 = org.apache.commons.net.imap.IMAP.IMAPState.AUTH_STATE
            r3.o0(r4)
            r4 = 1
            return r4
    }

    public boolean C0() throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.imap.IMAPCommand r0 = org.apache.commons.net.imap.IMAPCommand.LOGOUT
            boolean r0 = r1.b0(r0)
            return r0
    }

    public boolean D0(java.lang.String r3, java.lang.String r4) throws java.io.IOException {
            r2 = this;
            org.apache.commons.net.imap.IMAPCommand r0 = org.apache.commons.net.imap.IMAPCommand.LSUB
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = " "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            boolean r3 = r2.c0(r0, r3)
            return r3
    }

    public boolean E0() throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.imap.IMAPCommand r0 = org.apache.commons.net.imap.IMAPCommand.NOOP
            boolean r0 = r1.b0(r0)
            return r0
    }

    public boolean F0(java.lang.String r3, java.lang.String r4) throws java.io.IOException {
            r2 = this;
            org.apache.commons.net.imap.IMAPCommand r0 = org.apache.commons.net.imap.IMAPCommand.RENAME
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = " "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            boolean r3 = r2.c0(r0, r3)
            return r3
    }

    public boolean G0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            boolean r2 = r1.H0(r0, r2)
            return r2
    }

    public boolean H0(java.lang.String r3, java.lang.String r4) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = ""
            if (r3 == 0) goto L18
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "CHARSET "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
        L18:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            org.apache.commons.net.imap.IMAPCommand r4 = org.apache.commons.net.imap.IMAPCommand.SEARCH
            boolean r3 = r2.c0(r4, r3)
            return r3
    }

    public boolean I0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.imap.IMAPCommand r0 = org.apache.commons.net.imap.IMAPCommand.SELECT
            boolean r2 = r1.c0(r0, r2)
            return r2
    }

    public boolean J0(java.lang.String r3, java.lang.String[] r4) throws java.io.IOException {
            r2 = this;
            if (r4 == 0) goto L36
            int r0 = r4.length
            r1 = 1
            if (r0 < r1) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = " ("
            r0.append(r3)
            r3 = 0
        L14:
            int r1 = r4.length
            if (r3 >= r1) goto L26
            if (r3 <= 0) goto L1e
            java.lang.String r1 = " "
            r0.append(r1)
        L1e:
            r1 = r4[r3]
            r0.append(r1)
            int r3 = r3 + 1
            goto L14
        L26:
            java.lang.String r3 = ")"
            r0.append(r3)
            org.apache.commons.net.imap.IMAPCommand r3 = org.apache.commons.net.imap.IMAPCommand.STATUS
            java.lang.String r4 = r0.toString()
            boolean r3 = r2.c0(r3, r4)
            return r3
        L36:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "STATUS command requires at least one data item name"
            r3.<init>(r4)
            throw r3
    }

    public boolean K0(java.lang.String r3, java.lang.String r4, java.lang.String r5) throws java.io.IOException {
            r2 = this;
            org.apache.commons.net.imap.IMAPCommand r0 = org.apache.commons.net.imap.IMAPCommand.STORE
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = " "
            r1.append(r3)
            r1.append(r4)
            r1.append(r3)
            r1.append(r5)
            java.lang.String r3 = r1.toString()
            boolean r3 = r2.c0(r0, r3)
            return r3
    }

    public boolean L0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.imap.IMAPCommand r0 = org.apache.commons.net.imap.IMAPCommand.SUBSCRIBE
            boolean r2 = r1.c0(r0, r2)
            return r2
    }

    public boolean M0(java.lang.String r3, java.lang.String r4) throws java.io.IOException {
            r2 = this;
            org.apache.commons.net.imap.IMAPCommand r0 = org.apache.commons.net.imap.IMAPCommand.UID
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = " "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            boolean r3 = r2.c0(r0, r3)
            return r3
    }

    public boolean N0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.imap.IMAPCommand r0 = org.apache.commons.net.imap.IMAPCommand.UNSUBSCRIBE
            boolean r2 = r1.c0(r0, r2)
            return r2
    }

    public boolean delete(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.imap.IMAPCommand r0 = org.apache.commons.net.imap.IMAPCommand.DELETE
            boolean r2 = r1.c0(r0, r2)
            return r2
    }

    @java.lang.Deprecated
    public boolean p0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            boolean r2 = r1.q0(r2, r0, r0)
            return r2
    }

    @java.lang.Deprecated
    public boolean q0(java.lang.String r3, java.lang.String r4, java.lang.String r5) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = " "
            if (r4 == 0) goto L16
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r0)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
        L16:
            if (r5 == 0) goto L4d
            r4 = 0
            char r4 = r5.charAt(r4)
            r1 = 123(0x7b, float:1.72E-43)
            if (r4 != r1) goto L34
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r0)
            r4.append(r5)
            java.lang.String r3 = r4.toString()
            goto L4d
        L34:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = " {"
            r4.append(r3)
            r4.append(r5)
            java.lang.String r3 = "}"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
        L4d:
            org.apache.commons.net.imap.IMAPCommand r4 = org.apache.commons.net.imap.IMAPCommand.APPEND
            boolean r3 = r2.c0(r4, r3)
            return r3
    }

    public boolean r0(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) throws java.io.IOException {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            java.lang.String r4 = " "
            if (r5 == 0) goto Lf
            r0.append(r4)
            r0.append(r5)
        Lf:
            r5 = 0
            if (r6 == 0) goto L2a
            r0.append(r4)
            char r1 = r6.charAt(r5)
            r2 = 34
            if (r1 != r2) goto L21
            r0.append(r6)
            goto L2a
        L21:
            r0.append(r2)
            r0.append(r6)
            r0.append(r2)
        L2a:
            r0.append(r4)
            java.lang.String r4 = "\""
            boolean r6 = r7.startsWith(r4)
            if (r6 == 0) goto L49
            boolean r4 = r7.endsWith(r4)
            if (r4 == 0) goto L49
            r0.append(r7)
            org.apache.commons.net.imap.IMAPCommand r4 = org.apache.commons.net.imap.IMAPCommand.APPEND
            java.lang.String r5 = r0.toString()
            boolean r4 = r3.c0(r4, r5)
            return r4
        L49:
            r4 = 123(0x7b, float:1.72E-43)
            r0.append(r4)
            int r4 = r7.length()
            r0.append(r4)
            r4 = 125(0x7d, float:1.75E-43)
            r0.append(r4)
            org.apache.commons.net.imap.IMAPCommand r4 = org.apache.commons.net.imap.IMAPCommand.APPEND
            java.lang.String r6 = r0.toString()
            int r4 = r3.k0(r4, r6)
            boolean r4 = org.apache.commons.net.imap.a.d(r4)
            if (r4 == 0) goto L76
            int r4 = r3.m0(r7)
            boolean r4 = org.apache.commons.net.imap.a.f(r4)
            if (r4 == 0) goto L76
            r4 = 1
            return r4
        L76:
            return r5
    }

    public boolean s0() throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.imap.IMAPCommand r0 = org.apache.commons.net.imap.IMAPCommand.CAPABILITY
            boolean r0 = r1.b0(r0)
            return r0
    }

    public boolean t0() throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.imap.IMAPCommand r0 = org.apache.commons.net.imap.IMAPCommand.CHECK
            boolean r0 = r1.b0(r0)
            return r0
    }

    public boolean u0() throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.imap.IMAPCommand r0 = org.apache.commons.net.imap.IMAPCommand.CLOSE
            boolean r0 = r1.b0(r0)
            return r0
    }

    public boolean v0(java.lang.String r3, java.lang.String r4) throws java.io.IOException {
            r2 = this;
            org.apache.commons.net.imap.IMAPCommand r0 = org.apache.commons.net.imap.IMAPCommand.COPY
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = " "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            boolean r3 = r2.c0(r0, r3)
            return r3
    }

    public boolean w0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.imap.IMAPCommand r0 = org.apache.commons.net.imap.IMAPCommand.CREATE
            boolean r2 = r1.c0(r0, r2)
            return r2
    }

    public boolean x0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.imap.IMAPCommand r0 = org.apache.commons.net.imap.IMAPCommand.EXAMINE
            boolean r2 = r1.c0(r0, r2)
            return r2
    }

    public boolean y0() throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.imap.IMAPCommand r0 = org.apache.commons.net.imap.IMAPCommand.EXPUNGE
            boolean r0 = r1.b0(r0)
            return r0
    }

    public boolean z0(java.lang.String r3, java.lang.String r4) throws java.io.IOException {
            r2 = this;
            org.apache.commons.net.imap.IMAPCommand r0 = org.apache.commons.net.imap.IMAPCommand.FETCH
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = " "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            boolean r3 = r2.c0(r0, r3)
            return r3
    }
}
