package com.google.android.material.datepicker;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class CompositeDateValidator implements com.google.android.material.datepicker.CalendarConstraints.DateValidator {
    private static final com.google.android.material.datepicker.CompositeDateValidator.Operator ALL_OPERATOR = null;
    private static final com.google.android.material.datepicker.CompositeDateValidator.Operator ANY_OPERATOR = null;
    private static final int COMPARATOR_ALL_ID = 2;
    private static final int COMPARATOR_ANY_ID = 1;
    public static final android.os.Parcelable.Creator<com.google.android.material.datepicker.CompositeDateValidator> CREATOR = null;

    @androidx.annotation.NonNull
    private final com.google.android.material.datepicker.CompositeDateValidator.Operator operator;

    @androidx.annotation.NonNull
    private final java.util.List<com.google.android.material.datepicker.CalendarConstraints.DateValidator> validators;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private interface Operator {
        int getId();

        boolean isValid(@androidx.annotation.NonNull java.util.List<com.google.android.material.datepicker.CalendarConstraints.DateValidator> r1, long r2);
    }

    static {
            com.google.android.material.datepicker.CompositeDateValidator$1 r0 = new com.google.android.material.datepicker.CompositeDateValidator$1
            r0.<init>()
            com.google.android.material.datepicker.CompositeDateValidator.ANY_OPERATOR = r0
            com.google.android.material.datepicker.CompositeDateValidator$2 r0 = new com.google.android.material.datepicker.CompositeDateValidator$2
            r0.<init>()
            com.google.android.material.datepicker.CompositeDateValidator.ALL_OPERATOR = r0
            com.google.android.material.datepicker.CompositeDateValidator$3 r0 = new com.google.android.material.datepicker.CompositeDateValidator$3
            r0.<init>()
            com.google.android.material.datepicker.CompositeDateValidator.CREATOR = r0
            return
    }

    private CompositeDateValidator(@androidx.annotation.NonNull java.util.List<com.google.android.material.datepicker.CalendarConstraints.DateValidator> r1, com.google.android.material.datepicker.CompositeDateValidator.Operator r2) {
            r0 = this;
            r0.<init>()
            r0.validators = r1
            r0.operator = r2
            return
    }

    /* synthetic */ CompositeDateValidator(java.util.List r1, com.google.android.material.datepicker.CompositeDateValidator.Operator r2, com.google.android.material.datepicker.CompositeDateValidator.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    static /* synthetic */ com.google.android.material.datepicker.CompositeDateValidator.Operator access$000() {
            com.google.android.material.datepicker.CompositeDateValidator$Operator r0 = com.google.android.material.datepicker.CompositeDateValidator.ALL_OPERATOR
            return r0
    }

    static /* synthetic */ com.google.android.material.datepicker.CompositeDateValidator.Operator access$100() {
            com.google.android.material.datepicker.CompositeDateValidator$Operator r0 = com.google.android.material.datepicker.CompositeDateValidator.ANY_OPERATOR
            return r0
    }

    @androidx.annotation.NonNull
    public static com.google.android.material.datepicker.CalendarConstraints.DateValidator allOf(@androidx.annotation.NonNull java.util.List<com.google.android.material.datepicker.CalendarConstraints.DateValidator> r2) {
            com.google.android.material.datepicker.CompositeDateValidator r0 = new com.google.android.material.datepicker.CompositeDateValidator
            com.google.android.material.datepicker.CompositeDateValidator$Operator r1 = com.google.android.material.datepicker.CompositeDateValidator.ALL_OPERATOR
            r0.<init>(r2, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static com.google.android.material.datepicker.CalendarConstraints.DateValidator anyOf(@androidx.annotation.NonNull java.util.List<com.google.android.material.datepicker.CalendarConstraints.DateValidator> r2) {
            com.google.android.material.datepicker.CompositeDateValidator r0 = new com.google.android.material.datepicker.CompositeDateValidator
            com.google.android.material.datepicker.CompositeDateValidator$Operator r1 = com.google.android.material.datepicker.CompositeDateValidator.ANY_OPERATOR
            r0.<init>(r2, r1)
            return r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.material.datepicker.CompositeDateValidator
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.material.datepicker.CompositeDateValidator r5 = (com.google.android.material.datepicker.CompositeDateValidator) r5
            java.util.List<com.google.android.material.datepicker.CalendarConstraints$DateValidator> r1 = r4.validators
            java.util.List<com.google.android.material.datepicker.CalendarConstraints$DateValidator> r3 = r5.validators
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L25
            com.google.android.material.datepicker.CompositeDateValidator$Operator r1 = r4.operator
            int r1 = r1.getId()
            com.google.android.material.datepicker.CompositeDateValidator$Operator r5 = r5.operator
            int r5 = r5.getId()
            if (r1 != r5) goto L25
            return r0
        L25:
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.util.List<com.google.android.material.datepicker.CalendarConstraints$DateValidator> r0 = r1.validators
            int r0 = r0.hashCode()
            return r0
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean isValid(long r3) {
            r2 = this;
            com.google.android.material.datepicker.CompositeDateValidator$Operator r0 = r2.operator
            java.util.List<com.google.android.material.datepicker.CalendarConstraints$DateValidator> r1 = r2.validators
            boolean r3 = r0.isValid(r1, r3)
            return r3
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r1, int r2) {
            r0 = this;
            java.util.List<com.google.android.material.datepicker.CalendarConstraints$DateValidator> r2 = r0.validators
            r1.writeList(r2)
            com.google.android.material.datepicker.CompositeDateValidator$Operator r2 = r0.operator
            int r2 = r2.getId()
            r1.writeInt(r2)
            return
    }
}
