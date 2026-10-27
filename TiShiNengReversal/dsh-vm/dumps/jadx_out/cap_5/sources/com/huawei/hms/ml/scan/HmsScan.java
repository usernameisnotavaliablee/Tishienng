package com.huawei.hms.ml.scan;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class HmsScan extends com.huawei.hms.ml.scan.HmsScanBase {
    public static final int ARTICLE_NUMBER_FORM = 0;
    public static final int CONTACT_DETAIL_FORM = 0;
    public static final android.os.Parcelable.Creator<com.huawei.hms.ml.scan.HmsScan> CREATOR = null;
    public static final int DRIVER_INFO_FORM = 0;
    public static final int EMAIL_CONTENT_FORM = 0;
    public static final int EVENT_INFO_FORM = 0;
    public static final int ISBN_NUMBER_FORM = 0;
    public static final int LOCATION_COORDINATE_FORM = 0;
    public static final int PURE_TEXT_FORM = 0;
    public static final int SMS_FORM = 0;
    public static final int TEL_PHONE_NUMBER_FORM = 0;
    public static final int URL_FORM = 0;
    public static final int WIFI_CONNECT_INFO_FORM = 0;
    public com.huawei.hms.ml.scan.HmsScan.ContactDetail contactDetail;
    public com.huawei.hms.ml.scan.HmsScan.DriverInfo driverInfo;
    public com.huawei.hms.ml.scan.HmsScan.EmailContent emailContent;
    public com.huawei.hms.ml.scan.HmsScan.EventInfo eventInfo;
    public com.huawei.hms.ml.scan.HmsScan.LinkUrl linkUrl;
    public com.huawei.hms.ml.scan.HmsScan.LocationCoordinate locationCoordinate;
    public com.huawei.hms.ml.scan.HmsScan.SmsContent smsContent;
    public com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber telPhoneNumber;
    public com.huawei.hms.ml.scan.HmsScan.WiFiConnectionInfo wifiConnectionInfo;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class AddressInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.huawei.hms.ml.scan.HmsScan.AddressInfo> CREATOR = null;
        public static final int OFFICE_TYPE = 0;
        public static final int OTHER_USE_TYPE = 0;
        public static final int RESIDENTIAL_USE_TYPE = 0;
        public java.lang.String[] addressDetails;
        public int addressType;


        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        enum ADDRESS_TYPE extends java.lang.Enum<com.huawei.hms.ml.scan.HmsScan.AddressInfo.ADDRESS_TYPE> {
            private static final /* synthetic */ com.huawei.hms.ml.scan.HmsScan.AddressInfo.ADDRESS_TYPE[] $VALUES = null;
            public static final com.huawei.hms.ml.scan.HmsScan.AddressInfo.ADDRESS_TYPE OFFICE_TYPE = null;
            public static final com.huawei.hms.ml.scan.HmsScan.AddressInfo.ADDRESS_TYPE OTHER_USE_TYPE = null;
            public static final com.huawei.hms.ml.scan.HmsScan.AddressInfo.ADDRESS_TYPE RESIDENTIAL_USE_TYPE = null;
            private final int addressType;

            static {
                    com.huawei.hms.ml.scan.HmsScan$AddressInfo$ADDRESS_TYPE r0 = new com.huawei.hms.ml.scan.HmsScan$AddressInfo$ADDRESS_TYPE
                    r1 = -1
                    java.lang.String r2 = "OTHER_USE_TYPE"
                    r3 = 0
                    r0.<init>(r2, r3, r1)
                    com.huawei.hms.ml.scan.HmsScan.AddressInfo.ADDRESS_TYPE.OTHER_USE_TYPE = r0
                    com.huawei.hms.ml.scan.HmsScan$AddressInfo$ADDRESS_TYPE r1 = new com.huawei.hms.ml.scan.HmsScan$AddressInfo$ADDRESS_TYPE
                    java.lang.String r2 = "OFFICE_TYPE"
                    r4 = 1
                    r1.<init>(r2, r4, r4)
                    com.huawei.hms.ml.scan.HmsScan.AddressInfo.ADDRESS_TYPE.OFFICE_TYPE = r1
                    com.huawei.hms.ml.scan.HmsScan$AddressInfo$ADDRESS_TYPE r2 = new com.huawei.hms.ml.scan.HmsScan$AddressInfo$ADDRESS_TYPE
                    java.lang.String r5 = "RESIDENTIAL_USE_TYPE"
                    r6 = 2
                    r2.<init>(r5, r6, r3)
                    com.huawei.hms.ml.scan.HmsScan.AddressInfo.ADDRESS_TYPE.RESIDENTIAL_USE_TYPE = r2
                    r5 = 3
                    com.huawei.hms.ml.scan.HmsScan$AddressInfo$ADDRESS_TYPE[] r5 = new com.huawei.hms.ml.scan.HmsScan.AddressInfo.ADDRESS_TYPE[r5]
                    r5[r3] = r0
                    r5[r4] = r1
                    r5[r6] = r2
                    com.huawei.hms.ml.scan.HmsScan.AddressInfo.ADDRESS_TYPE.$VALUES = r5
                    return
            }

            ADDRESS_TYPE(java.lang.String r1, int r2, int r3) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    r0.addressType = r3
                    return
            }

            public static com.huawei.hms.ml.scan.HmsScan.AddressInfo.ADDRESS_TYPE valueOf(java.lang.String r1) {
                    java.lang.Class<com.huawei.hms.ml.scan.HmsScan$AddressInfo$ADDRESS_TYPE> r0 = com.huawei.hms.ml.scan.HmsScan.AddressInfo.ADDRESS_TYPE.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    com.huawei.hms.ml.scan.HmsScan$AddressInfo$ADDRESS_TYPE r1 = (com.huawei.hms.ml.scan.HmsScan.AddressInfo.ADDRESS_TYPE) r1
                    return r1
            }

            public static com.huawei.hms.ml.scan.HmsScan.AddressInfo.ADDRESS_TYPE[] values() {
                    com.huawei.hms.ml.scan.HmsScan$AddressInfo$ADDRESS_TYPE[] r0 = com.huawei.hms.ml.scan.HmsScan.AddressInfo.ADDRESS_TYPE.$VALUES
                    java.lang.Object r0 = r0.clone()
                    com.huawei.hms.ml.scan.HmsScan$AddressInfo$ADDRESS_TYPE[] r0 = (com.huawei.hms.ml.scan.HmsScan.AddressInfo.ADDRESS_TYPE[]) r0
                    return r0
            }

            int getAddressType() {
                    r1 = this;
                    int r0 = r1.addressType
                    return r0
            }
        }

        static {
                com.huawei.hms.ml.scan.HmsScan$AddressInfo$ADDRESS_TYPE r0 = com.huawei.hms.ml.scan.HmsScan.AddressInfo.ADDRESS_TYPE.OTHER_USE_TYPE
                int r0 = r0.getAddressType()
                com.huawei.hms.ml.scan.HmsScan.AddressInfo.OTHER_USE_TYPE = r0
                com.huawei.hms.ml.scan.HmsScan$AddressInfo$ADDRESS_TYPE r0 = com.huawei.hms.ml.scan.HmsScan.AddressInfo.ADDRESS_TYPE.OFFICE_TYPE
                int r0 = r0.getAddressType()
                com.huawei.hms.ml.scan.HmsScan.AddressInfo.OFFICE_TYPE = r0
                com.huawei.hms.ml.scan.HmsScan$AddressInfo$ADDRESS_TYPE r0 = com.huawei.hms.ml.scan.HmsScan.AddressInfo.ADDRESS_TYPE.RESIDENTIAL_USE_TYPE
                int r0 = r0.getAddressType()
                com.huawei.hms.ml.scan.HmsScan.AddressInfo.RESIDENTIAL_USE_TYPE = r0
                com.huawei.hms.ml.scan.HmsScan$AddressInfo$1 r0 = new com.huawei.hms.ml.scan.HmsScan$AddressInfo$1
                r0.<init>()
                com.huawei.hms.ml.scan.HmsScan.AddressInfo.CREATOR = r0
                return
        }

        public AddressInfo() {
                r0 = this;
                r0.<init>()
                return
        }

        protected AddressInfo(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                java.lang.String[] r0 = r2.createStringArray()
                r1.addressDetails = r0
                int r2 = r2.readInt()
                r1.addressType = r2
                return
        }

        public AddressInfo(java.lang.String[] r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.addressDetails = r1
                r0.addressType = r2
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        public java.lang.String[] getAddressDetails() {
                r1 = this;
                java.lang.String[] r0 = r1.addressDetails
                return r0
        }

        public int getAddressType() {
                r1 = this;
                int r0 = r1.addressType
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                java.lang.String[] r2 = r0.addressDetails
                r1.writeStringArray(r2)
                int r2 = r0.addressType
                r1.writeInt(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class ContactDetail implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.huawei.hms.ml.scan.HmsScan.ContactDetail> CREATOR = null;
        public com.huawei.hms.ml.scan.HmsScan.AddressInfo[] addressesInfos;
        public java.lang.String company;
        public java.lang.String[] contactLinks;
        public com.huawei.hms.ml.scan.HmsScan.EmailContent[] eMailContents;
        public java.lang.String note;
        public com.huawei.hms.ml.scan.HmsScan.PeopleName peopleName;
        public com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber[] telPhoneNumbers;
        public java.lang.String title;


        static {
                com.huawei.hms.ml.scan.HmsScan$ContactDetail$1 r0 = new com.huawei.hms.ml.scan.HmsScan$ContactDetail$1
                r0.<init>()
                com.huawei.hms.ml.scan.HmsScan.ContactDetail.CREATOR = r0
                return
        }

        public ContactDetail() {
                r0 = this;
                r0.<init>()
                return
        }

        protected ContactDetail(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                android.os.Parcelable$Creator<com.huawei.hms.ml.scan.HmsScan$AddressInfo> r0 = com.huawei.hms.ml.scan.HmsScan.AddressInfo.CREATOR
                java.lang.Object[] r0 = r2.createTypedArray(r0)
                com.huawei.hms.ml.scan.HmsScan$AddressInfo[] r0 = (com.huawei.hms.ml.scan.HmsScan.AddressInfo[]) r0
                r1.addressesInfos = r0
                android.os.Parcelable$Creator<com.huawei.hms.ml.scan.HmsScan$EmailContent> r0 = com.huawei.hms.ml.scan.HmsScan.EmailContent.CREATOR
                java.lang.Object[] r0 = r2.createTypedArray(r0)
                com.huawei.hms.ml.scan.HmsScan$EmailContent[] r0 = (com.huawei.hms.ml.scan.HmsScan.EmailContent[]) r0
                r1.eMailContents = r0
                java.lang.String r0 = r2.readString()
                r1.company = r0
                android.os.Parcelable$Creator<com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber> r0 = com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.CREATOR
                java.lang.Object[] r0 = r2.createTypedArray(r0)
                com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber[] r0 = (com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber[]) r0
                r1.telPhoneNumbers = r0
                java.lang.String r0 = r2.readString()
                r1.title = r0
                java.lang.String[] r0 = r2.createStringArray()
                r1.contactLinks = r0
                java.lang.Class<com.huawei.hms.ml.scan.HmsScan$PeopleName> r0 = com.huawei.hms.ml.scan.HmsScan.PeopleName.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r0 = r2.readParcelable(r0)
                com.huawei.hms.ml.scan.HmsScan$PeopleName r0 = (com.huawei.hms.ml.scan.HmsScan.PeopleName) r0
                r1.peopleName = r0
                java.lang.String r2 = r2.readString()
                r1.note = r2
                return
        }

        public ContactDetail(com.huawei.hms.ml.scan.HmsScan.PeopleName r1, java.lang.String r2, java.lang.String r3, com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber[] r4, com.huawei.hms.ml.scan.HmsScan.EmailContent[] r5, com.huawei.hms.ml.scan.HmsScan.AddressInfo[] r6, java.lang.String[] r7, java.lang.String r8) {
                r0 = this;
                r0.<init>()
                r0.peopleName = r1
                r0.title = r2
                r0.company = r3
                r0.telPhoneNumbers = r4
                r0.eMailContents = r5
                r0.addressesInfos = r6
                r0.contactLinks = r7
                r0.note = r8
                return
        }

        public ContactDetail(com.huawei.hms.ml.scan.HmsScan.PeopleName r10, com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber[] r11, com.huawei.hms.ml.scan.HmsScan.EmailContent[] r12) {
                r9 = this;
                r7 = 0
                r8 = 0
                r2 = 0
                r3 = 0
                r6 = 0
                r0 = r9
                r1 = r10
                r4 = r11
                r5 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        public java.util.List<com.huawei.hms.ml.scan.HmsScan.AddressInfo> getAddressesInfos() {
                r2 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                com.huawei.hms.ml.scan.HmsScan$AddressInfo[] r1 = r2.addressesInfos
                java.util.List r1 = java.util.Arrays.asList(r1)
                r0.<init>(r1)
                return r0
        }

        public java.lang.String getCompany() {
                r1 = this;
                java.lang.String r0 = r1.company
                return r0
        }

        public java.lang.String[] getContactLinks() {
                r1 = this;
                java.lang.String[] r0 = r1.contactLinks
                return r0
        }

        public java.util.List<com.huawei.hms.ml.scan.HmsScan.EmailContent> getEmailContents() {
                r2 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                com.huawei.hms.ml.scan.HmsScan$EmailContent[] r1 = r2.eMailContents
                java.util.List r1 = java.util.Arrays.asList(r1)
                r0.<init>(r1)
                return r0
        }

        public java.lang.String getNote() {
                r1 = this;
                java.lang.String r0 = r1.note
                return r0
        }

        public com.huawei.hms.ml.scan.HmsScan.PeopleName getPeopleName() {
                r1 = this;
                com.huawei.hms.ml.scan.HmsScan$PeopleName r0 = r1.peopleName
                return r0
        }

        public java.util.List<com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber> getTelPhoneNumbers() {
                r2 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber[] r1 = r2.telPhoneNumbers
                java.util.List r1 = java.util.Arrays.asList(r1)
                r0.<init>(r1)
                return r0
        }

        public java.lang.String getTitle() {
                r1 = this;
                java.lang.String r0 = r1.title
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                com.huawei.hms.ml.scan.HmsScan$AddressInfo[] r0 = r1.addressesInfos
                r2.writeTypedArray(r0, r3)
                com.huawei.hms.ml.scan.HmsScan$EmailContent[] r0 = r1.eMailContents
                r2.writeTypedArray(r0, r3)
                java.lang.String r0 = r1.company
                r2.writeString(r0)
                com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber[] r0 = r1.telPhoneNumbers
                r2.writeTypedArray(r0, r3)
                java.lang.String r0 = r1.title
                r2.writeString(r0)
                java.lang.String[] r0 = r1.contactLinks
                r2.writeStringArray(r0)
                com.huawei.hms.ml.scan.HmsScan$PeopleName r0 = r1.peopleName
                r2.writeParcelable(r0, r3)
                java.lang.String r3 = r1.note
                r2.writeString(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class DriverInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.huawei.hms.ml.scan.HmsScan.DriverInfo> CREATOR = null;
        public java.lang.String avenue;
        public java.lang.String certificateNumber;
        public java.lang.String certificateType;
        public java.lang.String city;
        public java.lang.String countryOfIssue;
        public java.lang.String dateOfBirth;
        public java.lang.String dateOfExpire;
        public java.lang.String dateOfIssue;
        public java.lang.String eyeColor;
        public java.lang.String familyName;
        public java.lang.String givenName;
        public java.lang.String hairColor;
        public java.lang.String height;
        public java.lang.String middleName;
        public java.lang.String province;
        public java.lang.String sex;
        public java.lang.String weightRange;
        public java.lang.String zipCode;


        static {
                com.huawei.hms.ml.scan.HmsScan$DriverInfo$1 r0 = new com.huawei.hms.ml.scan.HmsScan$DriverInfo$1
                r0.<init>()
                com.huawei.hms.ml.scan.HmsScan.DriverInfo.CREATOR = r0
                return
        }

        public DriverInfo() {
                r0 = this;
                r0.<init>()
                return
        }

        protected DriverInfo(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = r2.readString()
                r1.city = r0
                java.lang.String r0 = r2.readString()
                r1.province = r0
                java.lang.String r0 = r2.readString()
                r1.avenue = r0
                java.lang.String r0 = r2.readString()
                r1.zipCode = r0
                java.lang.String r0 = r2.readString()
                r1.dateOfBirth = r0
                java.lang.String r0 = r2.readString()
                r1.certificateType = r0
                java.lang.String r0 = r2.readString()
                r1.dateOfExpire = r0
                java.lang.String r0 = r2.readString()
                r1.givenName = r0
                java.lang.String r0 = r2.readString()
                r1.sex = r0
                java.lang.String r0 = r2.readString()
                r1.dateOfIssue = r0
                java.lang.String r0 = r2.readString()
                r1.countryOfIssue = r0
                java.lang.String r0 = r2.readString()
                r1.familyName = r0
                java.lang.String r0 = r2.readString()
                r1.certificateNumber = r0
                java.lang.String r0 = r2.readString()
                r1.middleName = r0
                java.lang.String r0 = r2.readString()
                r1.eyeColor = r0
                java.lang.String r0 = r2.readString()
                r1.hairColor = r0
                java.lang.String r0 = r2.readString()
                r1.height = r0
                java.lang.String r2 = r2.readString()
                r1.weightRange = r2
                return
        }

        public DriverInfo(java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24) {
                r19 = this;
                r17 = 0
                r18 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r0 = r19
                r1 = r20
                r2 = r21
                r3 = r22
                r4 = r23
                r5 = r24
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                return
        }

        public DriverInfo(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18) {
                r0 = this;
                r0.<init>()
                r0.certificateType = r1
                r0.givenName = r2
                r0.middleName = r3
                r0.familyName = r4
                r0.sex = r5
                r0.dateOfBirth = r6
                r0.avenue = r7
                r0.city = r8
                r0.province = r9
                r0.zipCode = r10
                r0.certificateNumber = r11
                r0.countryOfIssue = r12
                r0.dateOfIssue = r13
                r0.dateOfExpire = r14
                r0.eyeColor = r15
                r1 = r16
                r0.hairColor = r1
                r1 = r17
                r0.height = r1
                r1 = r18
                r0.weightRange = r1
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        public java.lang.String getAvenue() {
                r1 = this;
                java.lang.String r0 = r1.avenue
                return r0
        }

        public java.lang.String getCertificateNumber() {
                r1 = this;
                java.lang.String r0 = r1.certificateNumber
                return r0
        }

        public java.lang.String getCertificateType() {
                r1 = this;
                java.lang.String r0 = r1.certificateType
                return r0
        }

        public java.lang.String getCity() {
                r1 = this;
                java.lang.String r0 = r1.city
                return r0
        }

        public java.lang.String getCountryOfIssue() {
                r1 = this;
                java.lang.String r0 = r1.countryOfIssue
                return r0
        }

        public java.lang.String getDateOfBirth() {
                r1 = this;
                java.lang.String r0 = r1.dateOfBirth
                return r0
        }

        public java.lang.String getDateOfExpire() {
                r1 = this;
                java.lang.String r0 = r1.dateOfExpire
                return r0
        }

        public java.lang.String getDateOfIssue() {
                r1 = this;
                java.lang.String r0 = r1.dateOfIssue
                return r0
        }

        public java.lang.String getEyeColor() {
                r1 = this;
                java.lang.String r0 = r1.eyeColor
                return r0
        }

        public java.lang.String getFamilyName() {
                r1 = this;
                java.lang.String r0 = r1.familyName
                return r0
        }

        public java.lang.String getGivenName() {
                r1 = this;
                java.lang.String r0 = r1.givenName
                return r0
        }

        public java.lang.String getHairColor() {
                r1 = this;
                java.lang.String r0 = r1.hairColor
                return r0
        }

        public java.lang.String getHeight() {
                r1 = this;
                java.lang.String r0 = r1.height
                return r0
        }

        public java.lang.String getMiddleName() {
                r1 = this;
                java.lang.String r0 = r1.middleName
                return r0
        }

        public java.lang.String getProvince() {
                r1 = this;
                java.lang.String r0 = r1.province
                return r0
        }

        public java.lang.String getSex() {
                r1 = this;
                java.lang.String r0 = r1.sex
                return r0
        }

        public java.lang.String getWeightRange() {
                r1 = this;
                java.lang.String r0 = r1.weightRange
                return r0
        }

        public java.lang.String getZipCode() {
                r1 = this;
                java.lang.String r0 = r1.zipCode
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                java.lang.String r2 = r0.city
                r1.writeString(r2)
                java.lang.String r2 = r0.province
                r1.writeString(r2)
                java.lang.String r2 = r0.avenue
                r1.writeString(r2)
                java.lang.String r2 = r0.zipCode
                r1.writeString(r2)
                java.lang.String r2 = r0.dateOfBirth
                r1.writeString(r2)
                java.lang.String r2 = r0.certificateType
                r1.writeString(r2)
                java.lang.String r2 = r0.dateOfExpire
                r1.writeString(r2)
                java.lang.String r2 = r0.givenName
                r1.writeString(r2)
                java.lang.String r2 = r0.sex
                r1.writeString(r2)
                java.lang.String r2 = r0.dateOfIssue
                r1.writeString(r2)
                java.lang.String r2 = r0.countryOfIssue
                r1.writeString(r2)
                java.lang.String r2 = r0.familyName
                r1.writeString(r2)
                java.lang.String r2 = r0.certificateNumber
                r1.writeString(r2)
                java.lang.String r2 = r0.middleName
                r1.writeString(r2)
                java.lang.String r2 = r0.eyeColor
                r1.writeString(r2)
                java.lang.String r2 = r0.hairColor
                r1.writeString(r2)
                java.lang.String r2 = r0.height
                r1.writeString(r2)
                java.lang.String r2 = r0.weightRange
                r1.writeString(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class EmailContent implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.huawei.hms.ml.scan.HmsScan.EmailContent> CREATOR = null;
        public static final int OFFICE_USE_TYPE = 0;
        public static final int OTHER_USE_TYPE = 0;
        public static final int RESIDENTIAL_USE_TYPE = 0;
        public java.lang.String addressInfo;
        public int addressType;
        public java.lang.String bodyInfo;
        public java.lang.String subjectInfo;


        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        enum EMAIL_TYPE extends java.lang.Enum<com.huawei.hms.ml.scan.HmsScan.EmailContent.EMAIL_TYPE> {
            private static final /* synthetic */ com.huawei.hms.ml.scan.HmsScan.EmailContent.EMAIL_TYPE[] $VALUES = null;
            public static final com.huawei.hms.ml.scan.HmsScan.EmailContent.EMAIL_TYPE OFFICE_USE_TYPE = null;
            public static final com.huawei.hms.ml.scan.HmsScan.EmailContent.EMAIL_TYPE OTHER_USE_TYPE = null;
            public static final com.huawei.hms.ml.scan.HmsScan.EmailContent.EMAIL_TYPE RESIDENTIAL_USE_TYPE = null;
            private final int addressType;

            static {
                    com.huawei.hms.ml.scan.HmsScan$EmailContent$EMAIL_TYPE r0 = new com.huawei.hms.ml.scan.HmsScan$EmailContent$EMAIL_TYPE
                    r1 = -1
                    java.lang.String r2 = "OTHER_USE_TYPE"
                    r3 = 0
                    r0.<init>(r2, r3, r1)
                    com.huawei.hms.ml.scan.HmsScan.EmailContent.EMAIL_TYPE.OTHER_USE_TYPE = r0
                    com.huawei.hms.ml.scan.HmsScan$EmailContent$EMAIL_TYPE r1 = new com.huawei.hms.ml.scan.HmsScan$EmailContent$EMAIL_TYPE
                    java.lang.String r2 = "OFFICE_USE_TYPE"
                    r4 = 1
                    r1.<init>(r2, r4, r4)
                    com.huawei.hms.ml.scan.HmsScan.EmailContent.EMAIL_TYPE.OFFICE_USE_TYPE = r1
                    com.huawei.hms.ml.scan.HmsScan$EmailContent$EMAIL_TYPE r2 = new com.huawei.hms.ml.scan.HmsScan$EmailContent$EMAIL_TYPE
                    java.lang.String r5 = "RESIDENTIAL_USE_TYPE"
                    r6 = 2
                    r2.<init>(r5, r6, r3)
                    com.huawei.hms.ml.scan.HmsScan.EmailContent.EMAIL_TYPE.RESIDENTIAL_USE_TYPE = r2
                    r5 = 3
                    com.huawei.hms.ml.scan.HmsScan$EmailContent$EMAIL_TYPE[] r5 = new com.huawei.hms.ml.scan.HmsScan.EmailContent.EMAIL_TYPE[r5]
                    r5[r3] = r0
                    r5[r4] = r1
                    r5[r6] = r2
                    com.huawei.hms.ml.scan.HmsScan.EmailContent.EMAIL_TYPE.$VALUES = r5
                    return
            }

            EMAIL_TYPE(java.lang.String r1, int r2, int r3) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    r0.addressType = r3
                    return
            }

            public static com.huawei.hms.ml.scan.HmsScan.EmailContent.EMAIL_TYPE valueOf(java.lang.String r1) {
                    java.lang.Class<com.huawei.hms.ml.scan.HmsScan$EmailContent$EMAIL_TYPE> r0 = com.huawei.hms.ml.scan.HmsScan.EmailContent.EMAIL_TYPE.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    com.huawei.hms.ml.scan.HmsScan$EmailContent$EMAIL_TYPE r1 = (com.huawei.hms.ml.scan.HmsScan.EmailContent.EMAIL_TYPE) r1
                    return r1
            }

            public static com.huawei.hms.ml.scan.HmsScan.EmailContent.EMAIL_TYPE[] values() {
                    com.huawei.hms.ml.scan.HmsScan$EmailContent$EMAIL_TYPE[] r0 = com.huawei.hms.ml.scan.HmsScan.EmailContent.EMAIL_TYPE.$VALUES
                    java.lang.Object r0 = r0.clone()
                    com.huawei.hms.ml.scan.HmsScan$EmailContent$EMAIL_TYPE[] r0 = (com.huawei.hms.ml.scan.HmsScan.EmailContent.EMAIL_TYPE[]) r0
                    return r0
            }

            int getAddressType() {
                    r1 = this;
                    int r0 = r1.addressType
                    return r0
            }
        }

        static {
                com.huawei.hms.ml.scan.HmsScan$EmailContent$EMAIL_TYPE r0 = com.huawei.hms.ml.scan.HmsScan.EmailContent.EMAIL_TYPE.OTHER_USE_TYPE
                int r0 = r0.getAddressType()
                com.huawei.hms.ml.scan.HmsScan.EmailContent.OTHER_USE_TYPE = r0
                com.huawei.hms.ml.scan.HmsScan$EmailContent$EMAIL_TYPE r0 = com.huawei.hms.ml.scan.HmsScan.EmailContent.EMAIL_TYPE.OFFICE_USE_TYPE
                int r0 = r0.getAddressType()
                com.huawei.hms.ml.scan.HmsScan.EmailContent.OFFICE_USE_TYPE = r0
                com.huawei.hms.ml.scan.HmsScan$EmailContent$EMAIL_TYPE r0 = com.huawei.hms.ml.scan.HmsScan.EmailContent.EMAIL_TYPE.RESIDENTIAL_USE_TYPE
                int r0 = r0.getAddressType()
                com.huawei.hms.ml.scan.HmsScan.EmailContent.RESIDENTIAL_USE_TYPE = r0
                com.huawei.hms.ml.scan.HmsScan$EmailContent$1 r0 = new com.huawei.hms.ml.scan.HmsScan$EmailContent$1
                r0.<init>()
                com.huawei.hms.ml.scan.HmsScan.EmailContent.CREATOR = r0
                return
        }

        public EmailContent() {
                r0 = this;
                r0.<init>()
                return
        }

        protected EmailContent(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = r2.readString()
                r1.addressInfo = r0
                java.lang.String r0 = r2.readString()
                r1.bodyInfo = r0
                java.lang.String r0 = r2.readString()
                r1.subjectInfo = r0
                int r2 = r2.readInt()
                r1.addressType = r2
                return
        }

        public EmailContent(java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.addressInfo = r1
                r0.subjectInfo = r2
                r0.bodyInfo = r3
                r0.addressType = r4
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        public java.lang.String getAddressInfo() {
                r1 = this;
                java.lang.String r0 = r1.addressInfo
                return r0
        }

        public int getAddressType() {
                r1 = this;
                int r0 = r1.addressType
                return r0
        }

        public java.lang.String getBodyInfo() {
                r1 = this;
                java.lang.String r0 = r1.bodyInfo
                return r0
        }

        public java.lang.String getSubjectInfo() {
                r1 = this;
                java.lang.String r0 = r1.subjectInfo
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                java.lang.String r2 = r0.addressInfo
                r1.writeString(r2)
                java.lang.String r2 = r0.bodyInfo
                r1.writeString(r2)
                java.lang.String r2 = r0.subjectInfo
                r1.writeString(r2)
                int r2 = r0.addressType
                r1.writeInt(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class EventInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.huawei.hms.ml.scan.HmsScan.EventInfo> CREATOR = null;
        public java.lang.String abstractInfo;
        public com.huawei.hms.ml.scan.HmsScan.EventTime beginTime;
        public com.huawei.hms.ml.scan.HmsScan.EventTime closeTime;
        public java.lang.String condition;
        public java.lang.String placeInfo;
        public java.lang.String sponsor;
        public java.lang.String theme;


        static {
                com.huawei.hms.ml.scan.HmsScan$EventInfo$1 r0 = new com.huawei.hms.ml.scan.HmsScan$EventInfo$1
                r0.<init>()
                com.huawei.hms.ml.scan.HmsScan.EventInfo.CREATOR = r0
                return
        }

        public EventInfo() {
                r0 = this;
                r0.<init>()
                return
        }

        protected EventInfo(android.os.Parcel r3) {
                r2 = this;
                r2.<init>()
                java.lang.String r0 = r3.readString()
                r2.abstractInfo = r0
                java.lang.Class<com.huawei.hms.ml.scan.HmsScan$EventTime> r0 = com.huawei.hms.ml.scan.HmsScan.EventTime.class
                java.lang.ClassLoader r1 = r0.getClassLoader()
                android.os.Parcelable r1 = r3.readParcelable(r1)
                com.huawei.hms.ml.scan.HmsScan$EventTime r1 = (com.huawei.hms.ml.scan.HmsScan.EventTime) r1
                r2.closeTime = r1
                java.lang.String r1 = r3.readString()
                r2.placeInfo = r1
                java.lang.String r1 = r3.readString()
                r2.sponsor = r1
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r0 = r3.readParcelable(r0)
                com.huawei.hms.ml.scan.HmsScan$EventTime r0 = (com.huawei.hms.ml.scan.HmsScan.EventTime) r0
                r2.beginTime = r0
                java.lang.String r0 = r3.readString()
                r2.condition = r0
                java.lang.String r3 = r3.readString()
                r2.theme = r3
                return
        }

        public EventInfo(java.lang.String r9, com.huawei.hms.ml.scan.HmsScan.EventTime r10, com.huawei.hms.ml.scan.HmsScan.EventTime r11, java.lang.String r12) {
                r8 = this;
                r6 = 0
                r7 = 0
                r5 = 0
                r0 = r8
                r1 = r9
                r2 = r10
                r3 = r11
                r4 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return
        }

        public EventInfo(java.lang.String r1, com.huawei.hms.ml.scan.HmsScan.EventTime r2, com.huawei.hms.ml.scan.HmsScan.EventTime r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
                r0 = this;
                r0.<init>()
                r0.theme = r1
                r0.beginTime = r2
                r0.closeTime = r3
                r0.placeInfo = r4
                r0.abstractInfo = r5
                r0.sponsor = r6
                r0.condition = r7
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        public java.lang.String getAbstractInfo() {
                r1 = this;
                java.lang.String r0 = r1.abstractInfo
                return r0
        }

        public com.huawei.hms.ml.scan.HmsScan.EventTime getBeginTime() {
                r1 = this;
                com.huawei.hms.ml.scan.HmsScan$EventTime r0 = r1.beginTime
                return r0
        }

        public com.huawei.hms.ml.scan.HmsScan.EventTime getCloseTime() {
                r1 = this;
                com.huawei.hms.ml.scan.HmsScan$EventTime r0 = r1.closeTime
                return r0
        }

        public java.lang.String getCondition() {
                r1 = this;
                java.lang.String r0 = r1.condition
                return r0
        }

        public java.lang.String getPlaceInfo() {
                r1 = this;
                java.lang.String r0 = r1.placeInfo
                return r0
        }

        public java.lang.String getSponsor() {
                r1 = this;
                java.lang.String r0 = r1.sponsor
                return r0
        }

        public java.lang.String getTheme() {
                r1 = this;
                java.lang.String r0 = r1.theme
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                java.lang.String r0 = r1.abstractInfo
                r2.writeString(r0)
                com.huawei.hms.ml.scan.HmsScan$EventTime r0 = r1.closeTime
                r2.writeParcelable(r0, r3)
                java.lang.String r0 = r1.placeInfo
                r2.writeString(r0)
                java.lang.String r0 = r1.sponsor
                r2.writeString(r0)
                com.huawei.hms.ml.scan.HmsScan$EventTime r0 = r1.beginTime
                r2.writeParcelable(r0, r3)
                java.lang.String r3 = r1.condition
                r2.writeString(r3)
                java.lang.String r3 = r1.theme
                r2.writeString(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class EventTime implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.huawei.hms.ml.scan.HmsScan.EventTime> CREATOR = null;
        public int day;
        public int hours;
        public boolean isUTCTime;
        public int minutes;
        public int month;
        public java.lang.String originalValue;
        public int seconds;
        public int year;


        static {
                com.huawei.hms.ml.scan.HmsScan$EventTime$1 r0 = new com.huawei.hms.ml.scan.HmsScan$EventTime$1
                r0.<init>()
                com.huawei.hms.ml.scan.HmsScan.EventTime.CREATOR = r0
                return
        }

        public EventTime() {
                r0 = this;
                r0.<init>()
                return
        }

        public EventTime(int r10, int r11, int r12, int r13, int r14, int r15) {
                r9 = this;
                r7 = 1
                r8 = 0
                r0 = r9
                r1 = r10
                r2 = r11
                r3 = r12
                r4 = r13
                r5 = r14
                r6 = r15
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return
        }

        public EventTime(int r1, int r2, int r3, int r4, int r5, int r6, boolean r7, java.lang.String r8) {
                r0 = this;
                r0.<init>()
                r0.year = r1
                r0.month = r2
                r0.day = r3
                r0.hours = r4
                r0.minutes = r5
                r0.seconds = r6
                r0.isUTCTime = r7
                r0.originalValue = r8
                return
        }

        protected EventTime(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                int r0 = r2.readInt()
                r1.day = r0
                int r0 = r2.readInt()
                r1.hours = r0
                byte r0 = r2.readByte()
                if (r0 == 0) goto L17
                r0 = 1
                goto L18
            L17:
                r0 = 0
            L18:
                r1.isUTCTime = r0
                int r0 = r2.readInt()
                r1.minutes = r0
                int r0 = r2.readInt()
                r1.month = r0
                java.lang.String r0 = r2.readString()
                r1.originalValue = r0
                int r0 = r2.readInt()
                r1.seconds = r0
                int r2 = r2.readInt()
                r1.year = r2
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        public int getDay() {
                r1 = this;
                int r0 = r1.day
                return r0
        }

        public int getHours() {
                r1 = this;
                int r0 = r1.hours
                return r0
        }

        public int getMinutes() {
                r1 = this;
                int r0 = r1.minutes
                return r0
        }

        public int getMonth() {
                r1 = this;
                int r0 = r1.month
                return r0
        }

        public java.lang.String getOriginalValue() {
                r1 = this;
                java.lang.String r0 = r1.originalValue
                return r0
        }

        public int getSeconds() {
                r1 = this;
                int r0 = r1.seconds
                return r0
        }

        public int getYear() {
                r1 = this;
                int r0 = r1.year
                return r0
        }

        public boolean isUTCTime() {
                r1 = this;
                boolean r0 = r1.isUTCTime
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                int r2 = r0.day
                r1.writeInt(r2)
                int r2 = r0.hours
                r1.writeInt(r2)
                boolean r2 = r0.isUTCTime
                byte r2 = (byte) r2
                r1.writeByte(r2)
                int r2 = r0.minutes
                r1.writeInt(r2)
                int r2 = r0.month
                r1.writeInt(r2)
                java.lang.String r2 = r0.originalValue
                r1.writeString(r2)
                int r2 = r0.seconds
                r1.writeInt(r2)
                int r2 = r0.year
                r1.writeInt(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class LinkUrl implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.huawei.hms.ml.scan.HmsScan.LinkUrl> CREATOR = null;
        public java.lang.String linkvalue;
        public java.lang.String theme;


        static {
                com.huawei.hms.ml.scan.HmsScan$LinkUrl$1 r0 = new com.huawei.hms.ml.scan.HmsScan$LinkUrl$1
                r0.<init>()
                com.huawei.hms.ml.scan.HmsScan.LinkUrl.CREATOR = r0
                return
        }

        public LinkUrl() {
                r0 = this;
                r0.<init>()
                return
        }

        protected LinkUrl(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = r2.readString()
                r1.theme = r0
                java.lang.String r2 = r2.readString()
                r1.linkvalue = r2
                return
        }

        public LinkUrl(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.theme = r1
                r0.linkvalue = r2
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        public java.lang.String getLinkValue() {
                r1 = this;
                java.lang.String r0 = r1.linkvalue
                return r0
        }

        public java.lang.String getTheme() {
                r1 = this;
                java.lang.String r0 = r1.theme
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                java.lang.String r2 = r0.theme
                r1.writeString(r2)
                java.lang.String r2 = r0.linkvalue
                r1.writeString(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class LocationCoordinate implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.huawei.hms.ml.scan.HmsScan.LocationCoordinate> CREATOR = null;
        public double latitude;
        public double longitude;


        static {
                com.huawei.hms.ml.scan.HmsScan$LocationCoordinate$1 r0 = new com.huawei.hms.ml.scan.HmsScan$LocationCoordinate$1
                r0.<init>()
                com.huawei.hms.ml.scan.HmsScan.LocationCoordinate.CREATOR = r0
                return
        }

        public LocationCoordinate() {
                r0 = this;
                r0.<init>()
                return
        }

        public LocationCoordinate(double r1, double r3) {
                r0 = this;
                r0.<init>()
                r0.latitude = r1
                r0.longitude = r3
                return
        }

        protected LocationCoordinate(android.os.Parcel r3) {
                r2 = this;
                r2.<init>()
                double r0 = r3.readDouble()
                r2.latitude = r0
                double r0 = r3.readDouble()
                r2.longitude = r0
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        public double getLatitude() {
                r2 = this;
                double r0 = r2.latitude
                return r0
        }

        public double getLongitude() {
                r2 = this;
                double r0 = r2.longitude
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r3, int r4) {
                r2 = this;
                double r0 = r2.latitude
                r3.writeDouble(r0)
                double r0 = r2.longitude
                r3.writeDouble(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class PeopleName implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.huawei.hms.ml.scan.HmsScan.PeopleName> CREATOR = null;
        public java.lang.String familyName;
        public java.lang.String fullName;
        public java.lang.String givenName;
        public java.lang.String middleName;
        public java.lang.String namePrefix;
        public java.lang.String nameSuffix;
        public java.lang.String spelling;


        static {
                com.huawei.hms.ml.scan.HmsScan$PeopleName$1 r0 = new com.huawei.hms.ml.scan.HmsScan$PeopleName$1
                r0.<init>()
                com.huawei.hms.ml.scan.HmsScan.PeopleName.CREATOR = r0
                return
        }

        public PeopleName() {
                r0 = this;
                r0.<init>()
                return
        }

        protected PeopleName(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = r2.readString()
                r1.fullName = r0
                java.lang.String r0 = r2.readString()
                r1.spelling = r0
                java.lang.String r0 = r2.readString()
                r1.namePrefix = r0
                java.lang.String r0 = r2.readString()
                r1.givenName = r0
                java.lang.String r0 = r2.readString()
                r1.middleName = r0
                java.lang.String r0 = r2.readString()
                r1.familyName = r0
                java.lang.String r2 = r2.readString()
                r1.nameSuffix = r2
                return
        }

        public PeopleName(java.lang.String r9, java.lang.String r10, java.lang.String r11) {
                r8 = this;
                r5 = 0
                r7 = 0
                r2 = 0
                r3 = 0
                r0 = r8
                r1 = r9
                r4 = r10
                r6 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return
        }

        public PeopleName(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
                r0 = this;
                r0.<init>()
                r0.fullName = r1
                r0.spelling = r2
                r0.namePrefix = r3
                r0.givenName = r4
                r0.middleName = r5
                r0.familyName = r6
                r0.nameSuffix = r7
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        public java.lang.String getFamilyName() {
                r1 = this;
                java.lang.String r0 = r1.familyName
                return r0
        }

        public java.lang.String getFullName() {
                r1 = this;
                java.lang.String r0 = r1.fullName
                return r0
        }

        public java.lang.String getGivenName() {
                r1 = this;
                java.lang.String r0 = r1.givenName
                return r0
        }

        public java.lang.String getMiddleName() {
                r1 = this;
                java.lang.String r0 = r1.middleName
                return r0
        }

        public java.lang.String getNamePrefix() {
                r1 = this;
                java.lang.String r0 = r1.namePrefix
                return r0
        }

        public java.lang.String getNameSuffix() {
                r1 = this;
                java.lang.String r0 = r1.nameSuffix
                return r0
        }

        public java.lang.String getSpelling() {
                r1 = this;
                java.lang.String r0 = r1.spelling
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                java.lang.String r2 = r0.fullName
                r1.writeString(r2)
                java.lang.String r2 = r0.spelling
                r1.writeString(r2)
                java.lang.String r2 = r0.namePrefix
                r1.writeString(r2)
                java.lang.String r2 = r0.givenName
                r1.writeString(r2)
                java.lang.String r2 = r0.middleName
                r1.writeString(r2)
                java.lang.String r2 = r0.familyName
                r1.writeString(r2)
                java.lang.String r2 = r0.nameSuffix
                r1.writeString(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum SCAN_TYPE_FORMAT extends java.lang.Enum<com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT> {
        private static final /* synthetic */ com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT[] $VALUES = null;
        public static final com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT ARTICLE_NUMBER_FORM = null;
        public static final com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT BOOK_MARK_FORM = null;
        public static final com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT CONTACT_DETAIL_FORM = null;
        public static final com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT DRIVER_INFO_FORM = null;
        public static final com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT EMAIL_CONTENT_FORM = null;
        public static final com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT EVENT_INFO_FORM = null;
        public static final com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT ISBN_NUMBER_FORM = null;
        public static final com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT LOCATION_COORDINATE_FORM = null;
        public static final com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT PURE_TEXT_FORM = null;
        public static final com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT SMS_FORM = null;
        public static final com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT TEL_PHONE_NUMBER_FORM = null;
        public static final com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT URL_FORM = null;
        public static final com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT VEHICLEINFO_FORM = null;
        public static final com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT WIFI_CONNECT_INFO_FORM = null;
        private final int scanTypeFormat;

        static {
                com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT r0 = new com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT
                r1 = 1001(0x3e9, float:1.403E-42)
                java.lang.String r2 = "ARTICLE_NUMBER_FORM"
                r3 = 0
                r0.<init>(r2, r3, r1)
                com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT.ARTICLE_NUMBER_FORM = r0
                com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT r1 = new com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT
                r2 = 1002(0x3ea, float:1.404E-42)
                java.lang.String r4 = "EMAIL_CONTENT_FORM"
                r5 = 1
                r1.<init>(r4, r5, r2)
                com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT.EMAIL_CONTENT_FORM = r1
                com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT r2 = new com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT
                r4 = 1003(0x3eb, float:1.406E-42)
                java.lang.String r6 = "TEL_PHONE_NUMBER_FORM"
                r7 = 2
                r2.<init>(r6, r7, r4)
                com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT.TEL_PHONE_NUMBER_FORM = r2
                com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT r4 = new com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT
                r6 = 1004(0x3ec, float:1.407E-42)
                java.lang.String r8 = "PURE_TEXT_FORM"
                r9 = 3
                r4.<init>(r8, r9, r6)
                com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT.PURE_TEXT_FORM = r4
                com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT r6 = new com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT
                r8 = 1005(0x3ed, float:1.408E-42)
                java.lang.String r10 = "SMS_FORM"
                r11 = 4
                r6.<init>(r10, r11, r8)
                com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT.SMS_FORM = r6
                com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT r8 = new com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT
                r10 = 1006(0x3ee, float:1.41E-42)
                java.lang.String r12 = "URL_FORM"
                r13 = 5
                r8.<init>(r12, r13, r10)
                com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT.URL_FORM = r8
                com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT r10 = new com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT
                r12 = 1007(0x3ef, float:1.411E-42)
                java.lang.String r14 = "WIFI_CONNECT_INFO_FORM"
                r15 = 6
                r10.<init>(r14, r15, r12)
                com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT.WIFI_CONNECT_INFO_FORM = r10
                com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT r12 = new com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT
                r14 = 1008(0x3f0, float:1.413E-42)
                r16 = 0
                java.lang.String r3 = "EVENT_INFO_FORM"
                r17 = 1
                r5 = 7
                r12.<init>(r3, r5, r14)
                com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT.EVENT_INFO_FORM = r12
                com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT r3 = new com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT
                r14 = 1009(0x3f1, float:1.414E-42)
                r18 = 7
                java.lang.String r5 = "CONTACT_DETAIL_FORM"
                r19 = 2
                r7 = 8
                r3.<init>(r5, r7, r14)
                com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT.CONTACT_DETAIL_FORM = r3
                com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT r5 = new com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT
                r14 = 1010(0x3f2, float:1.415E-42)
                r20 = 8
                java.lang.String r7 = "DRIVER_INFO_FORM"
                r21 = 3
                r9 = 9
                r5.<init>(r7, r9, r14)
                com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT.DRIVER_INFO_FORM = r5
                com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT r7 = new com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT
                r14 = 1011(0x3f3, float:1.417E-42)
                r22 = 9
                java.lang.String r9 = "LOCATION_COORDINATE_FORM"
                r23 = 4
                r11 = 10
                r7.<init>(r9, r11, r14)
                com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT.LOCATION_COORDINATE_FORM = r7
                com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT r9 = new com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT
                r14 = 1012(0x3f4, float:1.418E-42)
                r24 = 10
                java.lang.String r11 = "ISBN_NUMBER_FORM"
                r25 = 5
                r13 = 11
                r9.<init>(r11, r13, r14)
                com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT.ISBN_NUMBER_FORM = r9
                com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT r11 = new com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT
                r14 = 1013(0x3f5, float:1.42E-42)
                r26 = 11
                java.lang.String r13 = "BOOK_MARK_FORM"
                r27 = 6
                r15 = 12
                r11.<init>(r13, r15, r14)
                com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT.BOOK_MARK_FORM = r11
                com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT r13 = new com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT
                r14 = 1014(0x3f6, float:1.421E-42)
                r28 = 12
                java.lang.String r15 = "VEHICLEINFO_FORM"
                r29 = r0
                r0 = 13
                r13.<init>(r15, r0, r14)
                com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT.VEHICLEINFO_FORM = r13
                r14 = 14
                com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT[] r14 = new com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT[r14]
                r14[r16] = r29
                r14[r17] = r1
                r14[r19] = r2
                r14[r21] = r4
                r14[r23] = r6
                r14[r25] = r8
                r14[r27] = r10
                r14[r18] = r12
                r14[r20] = r3
                r14[r22] = r5
                r14[r24] = r7
                r14[r26] = r9
                r14[r28] = r11
                r14[r0] = r13
                com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT.$VALUES = r14
                return
        }

        SCAN_TYPE_FORMAT(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.scanTypeFormat = r3
                return
        }

        public static com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT valueOf(java.lang.String r1) {
                java.lang.Class<com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT> r0 = com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT r1 = (com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT) r1
                return r1
        }

        public static com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT[] values() {
                com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT[] r0 = com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT.$VALUES
                java.lang.Object r0 = r0.clone()
                com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT[] r0 = (com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT[]) r0
                return r0
        }

        int getScanType() {
                r1 = this;
                int r0 = r1.scanTypeFormat
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class SmsContent implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.huawei.hms.ml.scan.HmsScan.SmsContent> CREATOR = null;
        public java.lang.String destPhoneNumber;
        public java.lang.String msgContent;


        static {
                com.huawei.hms.ml.scan.HmsScan$SmsContent$1 r0 = new com.huawei.hms.ml.scan.HmsScan$SmsContent$1
                r0.<init>()
                com.huawei.hms.ml.scan.HmsScan.SmsContent.CREATOR = r0
                return
        }

        public SmsContent() {
                r0 = this;
                r0.<init>()
                return
        }

        protected SmsContent(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = r2.readString()
                r1.msgContent = r0
                java.lang.String r2 = r2.readString()
                r1.destPhoneNumber = r2
                return
        }

        public SmsContent(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.msgContent = r1
                r0.destPhoneNumber = r2
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        public java.lang.String getDestPhoneNumber() {
                r1 = this;
                java.lang.String r0 = r1.destPhoneNumber
                return r0
        }

        public java.lang.String getMsgContent() {
                r1 = this;
                java.lang.String r0 = r1.msgContent
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                java.lang.String r2 = r0.msgContent
                r1.writeString(r2)
                java.lang.String r2 = r0.destPhoneNumber
                r1.writeString(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class TelPhoneNumber implements android.os.Parcelable {
        public static final int CELLPHONE_NUMBER_USE_TYPE = 0;
        public static final android.os.Parcelable.Creator<com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber> CREATOR = null;
        public static final int FAX_USE_TYPE = 0;
        public static final int OFFICE_USE_TYPE = 0;
        public static final int OTHER_USE_TYPE = 0;
        public static final int RESIDENTIAL_USE_TYPE = 0;
        public java.lang.String telPhoneNumber;
        public int useType;


        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        enum USE_TYPE extends java.lang.Enum<com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.USE_TYPE> {
            private static final /* synthetic */ com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.USE_TYPE[] $VALUES = null;
            public static final com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.USE_TYPE CELLPHONE_NUMBER_USE_TYPE = null;
            public static final com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.USE_TYPE FAX_USE_TYPE = null;
            public static final com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.USE_TYPE OFFICE_USE_TYPE = null;
            public static final com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.USE_TYPE OTHER_USE_TYPE = null;
            public static final com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.USE_TYPE RESIDENTIAL_USE_TYPE = null;
            private final int useType;

            static {
                    com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber$USE_TYPE r0 = new com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber$USE_TYPE
                    r1 = -1
                    java.lang.String r2 = "OTHER_USE_TYPE"
                    r3 = 0
                    r0.<init>(r2, r3, r1)
                    com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.USE_TYPE.OTHER_USE_TYPE = r0
                    com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber$USE_TYPE r1 = new com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber$USE_TYPE
                    java.lang.String r2 = "RESIDENTIAL_USE_TYPE"
                    r4 = 1
                    r1.<init>(r2, r4, r4)
                    com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.USE_TYPE.RESIDENTIAL_USE_TYPE = r1
                    com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber$USE_TYPE r2 = new com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber$USE_TYPE
                    java.lang.String r5 = "FAX_USE_TYPE"
                    r6 = 2
                    r2.<init>(r5, r6, r3)
                    com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.USE_TYPE.FAX_USE_TYPE = r2
                    com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber$USE_TYPE r5 = new com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber$USE_TYPE
                    java.lang.String r7 = "CELLPHONE_NUMBER_USE_TYPE"
                    r8 = 3
                    r5.<init>(r7, r8, r6)
                    com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.USE_TYPE.CELLPHONE_NUMBER_USE_TYPE = r5
                    com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber$USE_TYPE r7 = new com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber$USE_TYPE
                    java.lang.String r9 = "OFFICE_USE_TYPE"
                    r10 = 4
                    r7.<init>(r9, r10, r8)
                    com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.USE_TYPE.OFFICE_USE_TYPE = r7
                    r9 = 5
                    com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber$USE_TYPE[] r9 = new com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.USE_TYPE[r9]
                    r9[r3] = r0
                    r9[r4] = r1
                    r9[r6] = r2
                    r9[r8] = r5
                    r9[r10] = r7
                    com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.USE_TYPE.$VALUES = r9
                    return
            }

            USE_TYPE(java.lang.String r1, int r2, int r3) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    r0.useType = r3
                    return
            }

            public static com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.USE_TYPE valueOf(java.lang.String r1) {
                    java.lang.Class<com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber$USE_TYPE> r0 = com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.USE_TYPE.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber$USE_TYPE r1 = (com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.USE_TYPE) r1
                    return r1
            }

            public static com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.USE_TYPE[] values() {
                    com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber$USE_TYPE[] r0 = com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.USE_TYPE.$VALUES
                    java.lang.Object r0 = r0.clone()
                    com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber$USE_TYPE[] r0 = (com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.USE_TYPE[]) r0
                    return r0
            }

            int getUseType() {
                    r1 = this;
                    int r0 = r1.useType
                    return r0
            }
        }

        static {
                com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber$USE_TYPE r0 = com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.USE_TYPE.OTHER_USE_TYPE
                int r0 = r0.getUseType()
                com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.OTHER_USE_TYPE = r0
                com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber$USE_TYPE r0 = com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.USE_TYPE.OFFICE_USE_TYPE
                int r0 = r0.getUseType()
                com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.OFFICE_USE_TYPE = r0
                com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber$USE_TYPE r0 = com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.USE_TYPE.RESIDENTIAL_USE_TYPE
                int r0 = r0.getUseType()
                com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.RESIDENTIAL_USE_TYPE = r0
                com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber$USE_TYPE r0 = com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.USE_TYPE.FAX_USE_TYPE
                int r0 = r0.getUseType()
                com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.FAX_USE_TYPE = r0
                com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber$USE_TYPE r0 = com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.USE_TYPE.CELLPHONE_NUMBER_USE_TYPE
                int r0 = r0.getUseType()
                com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.CELLPHONE_NUMBER_USE_TYPE = r0
                com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber$1 r0 = new com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber$1
                r0.<init>()
                com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.CREATOR = r0
                return
        }

        public TelPhoneNumber() {
                r0 = this;
                r0.<init>()
                return
        }

        public TelPhoneNumber(int r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.useType = r1
                r0.telPhoneNumber = r2
                return
        }

        protected TelPhoneNumber(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = r2.readString()
                r1.telPhoneNumber = r0
                int r2 = r2.readInt()
                r1.useType = r2
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        public java.lang.String getTelPhoneNumber() {
                r1 = this;
                java.lang.String r0 = r1.telPhoneNumber
                return r0
        }

        public int getUseType() {
                r1 = this;
                int r0 = r1.useType
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                java.lang.String r2 = r0.telPhoneNumber
                r1.writeString(r2)
                int r2 = r0.useType
                r1.writeInt(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class WiFiConnectionInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.huawei.hms.ml.scan.HmsScan.WiFiConnectionInfo> CREATOR = null;
        public static final int NO_PASSWORD_MODE_TYPE = 0;
        public static final int SAE_MODE_TYPE = 0;
        public static final int WEP_MODE_TYPE = 0;
        public static final int WPA_MODE_TYPE = 0;
        public int cipherMode;
        public java.lang.String password;
        public java.lang.String ssidNumber;


        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        enum CIPHER_MODE extends java.lang.Enum<com.huawei.hms.ml.scan.HmsScan.WiFiConnectionInfo.CIPHER_MODE> {
            private static final /* synthetic */ com.huawei.hms.ml.scan.HmsScan.WiFiConnectionInfo.CIPHER_MODE[] $VALUES = null;
            public static final com.huawei.hms.ml.scan.HmsScan.WiFiConnectionInfo.CIPHER_MODE NO_PASSWORD_MODE_TYPE = null;
            public static final com.huawei.hms.ml.scan.HmsScan.WiFiConnectionInfo.CIPHER_MODE SAE_MODE_TYPE = null;
            public static final com.huawei.hms.ml.scan.HmsScan.WiFiConnectionInfo.CIPHER_MODE WEP_MODE_TYPE = null;
            public static final com.huawei.hms.ml.scan.HmsScan.WiFiConnectionInfo.CIPHER_MODE WPA_MODE_TYPE = null;
            private final int cipherMode;

            static {
                    com.huawei.hms.ml.scan.HmsScan$WiFiConnectionInfo$CIPHER_MODE r0 = new com.huawei.hms.ml.scan.HmsScan$WiFiConnectionInfo$CIPHER_MODE
                    java.lang.String r1 = "SAE_MODE_TYPE"
                    r2 = 0
                    r3 = 3
                    r0.<init>(r1, r2, r3)
                    com.huawei.hms.ml.scan.HmsScan.WiFiConnectionInfo.CIPHER_MODE.SAE_MODE_TYPE = r0
                    com.huawei.hms.ml.scan.HmsScan$WiFiConnectionInfo$CIPHER_MODE r1 = new com.huawei.hms.ml.scan.HmsScan$WiFiConnectionInfo$CIPHER_MODE
                    java.lang.String r4 = "WEP_MODE_TYPE"
                    r5 = 1
                    r6 = 2
                    r1.<init>(r4, r5, r6)
                    com.huawei.hms.ml.scan.HmsScan.WiFiConnectionInfo.CIPHER_MODE.WEP_MODE_TYPE = r1
                    com.huawei.hms.ml.scan.HmsScan$WiFiConnectionInfo$CIPHER_MODE r4 = new com.huawei.hms.ml.scan.HmsScan$WiFiConnectionInfo$CIPHER_MODE
                    java.lang.String r7 = "NO_PASSWORD_MODE_TYPE"
                    r4.<init>(r7, r6, r2)
                    com.huawei.hms.ml.scan.HmsScan.WiFiConnectionInfo.CIPHER_MODE.NO_PASSWORD_MODE_TYPE = r4
                    com.huawei.hms.ml.scan.HmsScan$WiFiConnectionInfo$CIPHER_MODE r7 = new com.huawei.hms.ml.scan.HmsScan$WiFiConnectionInfo$CIPHER_MODE
                    java.lang.String r8 = "WPA_MODE_TYPE"
                    r7.<init>(r8, r3, r5)
                    com.huawei.hms.ml.scan.HmsScan.WiFiConnectionInfo.CIPHER_MODE.WPA_MODE_TYPE = r7
                    r8 = 4
                    com.huawei.hms.ml.scan.HmsScan$WiFiConnectionInfo$CIPHER_MODE[] r8 = new com.huawei.hms.ml.scan.HmsScan.WiFiConnectionInfo.CIPHER_MODE[r8]
                    r8[r2] = r0
                    r8[r5] = r1
                    r8[r6] = r4
                    r8[r3] = r7
                    com.huawei.hms.ml.scan.HmsScan.WiFiConnectionInfo.CIPHER_MODE.$VALUES = r8
                    return
            }

            CIPHER_MODE(java.lang.String r1, int r2, int r3) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    r0.cipherMode = r3
                    return
            }

            public static com.huawei.hms.ml.scan.HmsScan.WiFiConnectionInfo.CIPHER_MODE valueOf(java.lang.String r1) {
                    java.lang.Class<com.huawei.hms.ml.scan.HmsScan$WiFiConnectionInfo$CIPHER_MODE> r0 = com.huawei.hms.ml.scan.HmsScan.WiFiConnectionInfo.CIPHER_MODE.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    com.huawei.hms.ml.scan.HmsScan$WiFiConnectionInfo$CIPHER_MODE r1 = (com.huawei.hms.ml.scan.HmsScan.WiFiConnectionInfo.CIPHER_MODE) r1
                    return r1
            }

            public static com.huawei.hms.ml.scan.HmsScan.WiFiConnectionInfo.CIPHER_MODE[] values() {
                    com.huawei.hms.ml.scan.HmsScan$WiFiConnectionInfo$CIPHER_MODE[] r0 = com.huawei.hms.ml.scan.HmsScan.WiFiConnectionInfo.CIPHER_MODE.$VALUES
                    java.lang.Object r0 = r0.clone()
                    com.huawei.hms.ml.scan.HmsScan$WiFiConnectionInfo$CIPHER_MODE[] r0 = (com.huawei.hms.ml.scan.HmsScan.WiFiConnectionInfo.CIPHER_MODE[]) r0
                    return r0
            }

            int getCipherMode() {
                    r1 = this;
                    int r0 = r1.cipherMode
                    return r0
            }
        }

        static {
                com.huawei.hms.ml.scan.HmsScan$WiFiConnectionInfo$CIPHER_MODE r0 = com.huawei.hms.ml.scan.HmsScan.WiFiConnectionInfo.CIPHER_MODE.NO_PASSWORD_MODE_TYPE
                int r0 = r0.getCipherMode()
                com.huawei.hms.ml.scan.HmsScan.WiFiConnectionInfo.NO_PASSWORD_MODE_TYPE = r0
                com.huawei.hms.ml.scan.HmsScan$WiFiConnectionInfo$CIPHER_MODE r0 = com.huawei.hms.ml.scan.HmsScan.WiFiConnectionInfo.CIPHER_MODE.WEP_MODE_TYPE
                int r0 = r0.getCipherMode()
                com.huawei.hms.ml.scan.HmsScan.WiFiConnectionInfo.WEP_MODE_TYPE = r0
                com.huawei.hms.ml.scan.HmsScan$WiFiConnectionInfo$CIPHER_MODE r0 = com.huawei.hms.ml.scan.HmsScan.WiFiConnectionInfo.CIPHER_MODE.WPA_MODE_TYPE
                int r0 = r0.getCipherMode()
                com.huawei.hms.ml.scan.HmsScan.WiFiConnectionInfo.WPA_MODE_TYPE = r0
                com.huawei.hms.ml.scan.HmsScan$WiFiConnectionInfo$CIPHER_MODE r0 = com.huawei.hms.ml.scan.HmsScan.WiFiConnectionInfo.CIPHER_MODE.SAE_MODE_TYPE
                int r0 = r0.getCipherMode()
                com.huawei.hms.ml.scan.HmsScan.WiFiConnectionInfo.SAE_MODE_TYPE = r0
                com.huawei.hms.ml.scan.HmsScan$WiFiConnectionInfo$1 r0 = new com.huawei.hms.ml.scan.HmsScan$WiFiConnectionInfo$1
                r0.<init>()
                com.huawei.hms.ml.scan.HmsScan.WiFiConnectionInfo.CREATOR = r0
                return
        }

        public WiFiConnectionInfo() {
                r0 = this;
                r0.<init>()
                return
        }

        protected WiFiConnectionInfo(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                int r0 = r2.readInt()
                r1.cipherMode = r0
                java.lang.String r0 = r2.readString()
                r1.password = r0
                java.lang.String r2 = r2.readString()
                r1.ssidNumber = r2
                return
        }

        public WiFiConnectionInfo(java.lang.String r1, java.lang.String r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.ssidNumber = r1
                r0.password = r2
                r0.cipherMode = r3
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        public int getCipherMode() {
                r1 = this;
                int r0 = r1.cipherMode
                return r0
        }

        public java.lang.String getPassword() {
                r1 = this;
                java.lang.String r0 = r1.password
                return r0
        }

        public java.lang.String getSsidNumber() {
                r1 = this;
                java.lang.String r0 = r1.ssidNumber
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                int r2 = r0.cipherMode
                r1.writeInt(r2)
                java.lang.String r2 = r0.password
                r1.writeString(r2)
                java.lang.String r2 = r0.ssidNumber
                r1.writeString(r2)
                return
        }
    }

    static {
            com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT r0 = com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT.ARTICLE_NUMBER_FORM
            int r0 = r0.getScanType()
            com.huawei.hms.ml.scan.HmsScan.ARTICLE_NUMBER_FORM = r0
            com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT r0 = com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT.PURE_TEXT_FORM
            int r0 = r0.getScanType()
            com.huawei.hms.ml.scan.HmsScan.PURE_TEXT_FORM = r0
            com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT r0 = com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT.ISBN_NUMBER_FORM
            int r0 = r0.getScanType()
            com.huawei.hms.ml.scan.HmsScan.ISBN_NUMBER_FORM = r0
            com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT r0 = com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT.EVENT_INFO_FORM
            int r0 = r0.getScanType()
            com.huawei.hms.ml.scan.HmsScan.EVENT_INFO_FORM = r0
            com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT r0 = com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT.CONTACT_DETAIL_FORM
            int r0 = r0.getScanType()
            com.huawei.hms.ml.scan.HmsScan.CONTACT_DETAIL_FORM = r0
            com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT r0 = com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT.DRIVER_INFO_FORM
            int r0 = r0.getScanType()
            com.huawei.hms.ml.scan.HmsScan.DRIVER_INFO_FORM = r0
            com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT r0 = com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT.EMAIL_CONTENT_FORM
            int r0 = r0.getScanType()
            com.huawei.hms.ml.scan.HmsScan.EMAIL_CONTENT_FORM = r0
            com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT r0 = com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT.LOCATION_COORDINATE_FORM
            int r0 = r0.getScanType()
            com.huawei.hms.ml.scan.HmsScan.LOCATION_COORDINATE_FORM = r0
            com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT r0 = com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT.TEL_PHONE_NUMBER_FORM
            int r0 = r0.getScanType()
            com.huawei.hms.ml.scan.HmsScan.TEL_PHONE_NUMBER_FORM = r0
            com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT r0 = com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT.SMS_FORM
            int r0 = r0.getScanType()
            com.huawei.hms.ml.scan.HmsScan.SMS_FORM = r0
            com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT r0 = com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT.URL_FORM
            int r0 = r0.getScanType()
            com.huawei.hms.ml.scan.HmsScan.URL_FORM = r0
            com.huawei.hms.ml.scan.HmsScan$SCAN_TYPE_FORMAT r0 = com.huawei.hms.ml.scan.HmsScan.SCAN_TYPE_FORMAT.WIFI_CONNECT_INFO_FORM
            int r0 = r0.getScanType()
            com.huawei.hms.ml.scan.HmsScan.WIFI_CONNECT_INFO_FORM = r0
            com.huawei.hms.ml.scan.HmsScan$1 r0 = new com.huawei.hms.ml.scan.HmsScan$1
            r0.<init>()
            com.huawei.hms.ml.scan.HmsScan.CREATOR = r0
            return
    }

    public HmsScan() {
            r0 = this;
            r0.<init>()
            return
    }

    protected HmsScan(android.os.Parcel r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public HmsScan(java.lang.String r1, int r2, java.lang.String r3, int r4, byte[] r5, android.graphics.Point[] r6, com.huawei.hms.ml.scan.HmsScanAnalyzerOptions r7) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public HmsScan(java.lang.String r1, int r2, java.lang.String r3, int r4, byte[] r5, android.graphics.Point[] r6, com.huawei.hms.ml.scan.HmsScanAnalyzerOptions r7, com.huawei.hms.scankit.p.z6 r8) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r1 = r0
            if (r8 == 0) goto L8a
            java.lang.Object r2 = r8.a()
            if (r2 == 0) goto L8a
            int r2 = com.huawei.hms.ml.scan.HmsScan.ARTICLE_NUMBER_FORM
            if (r4 != r2) goto L11
            return
        L11:
            int r2 = com.huawei.hms.ml.scan.HmsScan.EMAIL_CONTENT_FORM
            if (r4 != r2) goto L1e
            java.lang.Object r2 = r8.a()
            com.huawei.hms.ml.scan.HmsScan$EmailContent r2 = (com.huawei.hms.ml.scan.HmsScan.EmailContent) r2
            r1.emailContent = r2
            return
        L1e:
            int r2 = com.huawei.hms.ml.scan.HmsScan.TEL_PHONE_NUMBER_FORM
            if (r4 != r2) goto L2b
            java.lang.Object r2 = r8.a()
            com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber r2 = (com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber) r2
            r1.telPhoneNumber = r2
            return
        L2b:
            int r2 = com.huawei.hms.ml.scan.HmsScan.PURE_TEXT_FORM
            if (r4 != r2) goto L30
            return
        L30:
            int r2 = com.huawei.hms.ml.scan.HmsScan.SMS_FORM
            if (r4 != r2) goto L3d
            java.lang.Object r2 = r8.a()
            com.huawei.hms.ml.scan.HmsScan$SmsContent r2 = (com.huawei.hms.ml.scan.HmsScan.SmsContent) r2
            r1.smsContent = r2
            return
        L3d:
            int r2 = com.huawei.hms.ml.scan.HmsScan.URL_FORM
            if (r4 != r2) goto L4a
            java.lang.Object r2 = r8.a()
            com.huawei.hms.ml.scan.HmsScan$LinkUrl r2 = (com.huawei.hms.ml.scan.HmsScan.LinkUrl) r2
            r1.linkUrl = r2
            return
        L4a:
            int r2 = com.huawei.hms.ml.scan.HmsScan.WIFI_CONNECT_INFO_FORM
            if (r4 != r2) goto L57
            java.lang.Object r2 = r8.a()
            com.huawei.hms.ml.scan.HmsScan$WiFiConnectionInfo r2 = (com.huawei.hms.ml.scan.HmsScan.WiFiConnectionInfo) r2
            r1.wifiConnectionInfo = r2
            return
        L57:
            int r2 = com.huawei.hms.ml.scan.HmsScan.EVENT_INFO_FORM
            if (r4 != r2) goto L64
            java.lang.Object r2 = r8.a()
            com.huawei.hms.ml.scan.HmsScan$EventInfo r2 = (com.huawei.hms.ml.scan.HmsScan.EventInfo) r2
            r1.eventInfo = r2
            return
        L64:
            int r2 = com.huawei.hms.ml.scan.HmsScan.CONTACT_DETAIL_FORM
            if (r4 != r2) goto L71
            java.lang.Object r2 = r8.a()
            com.huawei.hms.ml.scan.HmsScan$ContactDetail r2 = (com.huawei.hms.ml.scan.HmsScan.ContactDetail) r2
            r1.contactDetail = r2
            return
        L71:
            int r2 = com.huawei.hms.ml.scan.HmsScan.DRIVER_INFO_FORM
            if (r4 != r2) goto L7e
            java.lang.Object r2 = r8.a()
            com.huawei.hms.ml.scan.HmsScan$DriverInfo r2 = (com.huawei.hms.ml.scan.HmsScan.DriverInfo) r2
            r1.driverInfo = r2
            return
        L7e:
            int r2 = com.huawei.hms.ml.scan.HmsScan.LOCATION_COORDINATE_FORM
            if (r4 != r2) goto L8a
            java.lang.Object r2 = r8.a()
            com.huawei.hms.ml.scan.HmsScan$LocationCoordinate r2 = (com.huawei.hms.ml.scan.HmsScan.LocationCoordinate) r2
            r1.locationCoordinate = r2
        L8a:
            return
    }

    @Override // com.huawei.hms.ml.scan.HmsScanBase, android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.huawei.hms.ml.scan.HmsScanBase
    protected void detailTrans(android.os.Parcel r3) {
            r2 = this;
            int r0 = r2.scanTypeForm
            int r1 = com.huawei.hms.ml.scan.HmsScan.ARTICLE_NUMBER_FORM
            if (r0 != r1) goto L7
            return
        L7:
            int r1 = com.huawei.hms.ml.scan.HmsScan.EMAIL_CONTENT_FORM
            if (r0 != r1) goto L1a
            java.lang.Class<com.huawei.hms.ml.scan.HmsScan$EmailContent> r0 = com.huawei.hms.ml.scan.HmsScan.EmailContent.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r3 = r3.readParcelable(r0)
            com.huawei.hms.ml.scan.HmsScan$EmailContent r3 = (com.huawei.hms.ml.scan.HmsScan.EmailContent) r3
            r2.emailContent = r3
            return
        L1a:
            int r1 = com.huawei.hms.ml.scan.HmsScan.TEL_PHONE_NUMBER_FORM
            if (r0 != r1) goto L2d
            java.lang.Class<com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber> r0 = com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r3 = r3.readParcelable(r0)
            com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber r3 = (com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber) r3
            r2.telPhoneNumber = r3
            return
        L2d:
            int r1 = com.huawei.hms.ml.scan.HmsScan.PURE_TEXT_FORM
            if (r0 != r1) goto L32
            return
        L32:
            int r1 = com.huawei.hms.ml.scan.HmsScan.SMS_FORM
            if (r0 != r1) goto L45
            java.lang.Class<com.huawei.hms.ml.scan.HmsScan$SmsContent> r0 = com.huawei.hms.ml.scan.HmsScan.SmsContent.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r3 = r3.readParcelable(r0)
            com.huawei.hms.ml.scan.HmsScan$SmsContent r3 = (com.huawei.hms.ml.scan.HmsScan.SmsContent) r3
            r2.smsContent = r3
            return
        L45:
            int r1 = com.huawei.hms.ml.scan.HmsScan.URL_FORM
            if (r0 != r1) goto L58
            java.lang.Class<com.huawei.hms.ml.scan.HmsScan$LinkUrl> r0 = com.huawei.hms.ml.scan.HmsScan.LinkUrl.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r3 = r3.readParcelable(r0)
            com.huawei.hms.ml.scan.HmsScan$LinkUrl r3 = (com.huawei.hms.ml.scan.HmsScan.LinkUrl) r3
            r2.linkUrl = r3
            return
        L58:
            int r1 = com.huawei.hms.ml.scan.HmsScan.WIFI_CONNECT_INFO_FORM
            if (r0 != r1) goto L6b
            java.lang.Class<com.huawei.hms.ml.scan.HmsScan$WiFiConnectionInfo> r0 = com.huawei.hms.ml.scan.HmsScan.WiFiConnectionInfo.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r3 = r3.readParcelable(r0)
            com.huawei.hms.ml.scan.HmsScan$WiFiConnectionInfo r3 = (com.huawei.hms.ml.scan.HmsScan.WiFiConnectionInfo) r3
            r2.wifiConnectionInfo = r3
            return
        L6b:
            int r1 = com.huawei.hms.ml.scan.HmsScan.EVENT_INFO_FORM
            if (r0 != r1) goto L7e
            java.lang.Class<com.huawei.hms.ml.scan.HmsScan$EventInfo> r0 = com.huawei.hms.ml.scan.HmsScan.EventInfo.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r3 = r3.readParcelable(r0)
            com.huawei.hms.ml.scan.HmsScan$EventInfo r3 = (com.huawei.hms.ml.scan.HmsScan.EventInfo) r3
            r2.eventInfo = r3
            return
        L7e:
            int r1 = com.huawei.hms.ml.scan.HmsScan.CONTACT_DETAIL_FORM
            if (r0 != r1) goto L91
            java.lang.Class<com.huawei.hms.ml.scan.HmsScan$ContactDetail> r0 = com.huawei.hms.ml.scan.HmsScan.ContactDetail.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r3 = r3.readParcelable(r0)
            com.huawei.hms.ml.scan.HmsScan$ContactDetail r3 = (com.huawei.hms.ml.scan.HmsScan.ContactDetail) r3
            r2.contactDetail = r3
            return
        L91:
            int r1 = com.huawei.hms.ml.scan.HmsScan.DRIVER_INFO_FORM
            if (r0 != r1) goto La4
            java.lang.Class<com.huawei.hms.ml.scan.HmsScan$DriverInfo> r0 = com.huawei.hms.ml.scan.HmsScan.DriverInfo.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r3 = r3.readParcelable(r0)
            com.huawei.hms.ml.scan.HmsScan$DriverInfo r3 = (com.huawei.hms.ml.scan.HmsScan.DriverInfo) r3
            r2.driverInfo = r3
            return
        La4:
            int r1 = com.huawei.hms.ml.scan.HmsScan.LOCATION_COORDINATE_FORM
            if (r0 != r1) goto Lb6
            java.lang.Class<com.huawei.hms.ml.scan.HmsScan$LocationCoordinate> r0 = com.huawei.hms.ml.scan.HmsScan.LocationCoordinate.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r3 = r3.readParcelable(r0)
            com.huawei.hms.ml.scan.HmsScan$LocationCoordinate r3 = (com.huawei.hms.ml.scan.HmsScan.LocationCoordinate) r3
            r2.locationCoordinate = r3
        Lb6:
            return
    }

    @Override // com.huawei.hms.ml.scan.HmsScanBase
    protected void detailTransOut(android.os.Parcel r3, int r4) {
            r2 = this;
            int r0 = r2.scanTypeForm
            int r1 = com.huawei.hms.ml.scan.HmsScan.ARTICLE_NUMBER_FORM
            if (r0 != r1) goto L7
            return
        L7:
            int r1 = com.huawei.hms.ml.scan.HmsScan.EMAIL_CONTENT_FORM
            if (r0 != r1) goto L11
            com.huawei.hms.ml.scan.HmsScan$EmailContent r0 = r2.emailContent
            r3.writeParcelable(r0, r4)
            return
        L11:
            int r1 = com.huawei.hms.ml.scan.HmsScan.TEL_PHONE_NUMBER_FORM
            if (r0 != r1) goto L1b
            com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber r0 = r2.telPhoneNumber
            r3.writeParcelable(r0, r4)
            return
        L1b:
            int r1 = com.huawei.hms.ml.scan.HmsScan.PURE_TEXT_FORM
            if (r0 != r1) goto L20
            return
        L20:
            int r1 = com.huawei.hms.ml.scan.HmsScan.SMS_FORM
            if (r0 != r1) goto L2a
            com.huawei.hms.ml.scan.HmsScan$SmsContent r0 = r2.smsContent
            r3.writeParcelable(r0, r4)
            return
        L2a:
            int r1 = com.huawei.hms.ml.scan.HmsScan.URL_FORM
            if (r0 != r1) goto L34
            com.huawei.hms.ml.scan.HmsScan$LinkUrl r0 = r2.linkUrl
            r3.writeParcelable(r0, r4)
            return
        L34:
            int r1 = com.huawei.hms.ml.scan.HmsScan.WIFI_CONNECT_INFO_FORM
            if (r0 != r1) goto L3e
            com.huawei.hms.ml.scan.HmsScan$WiFiConnectionInfo r0 = r2.wifiConnectionInfo
            r3.writeParcelable(r0, r4)
            return
        L3e:
            int r1 = com.huawei.hms.ml.scan.HmsScan.EVENT_INFO_FORM
            if (r0 != r1) goto L48
            com.huawei.hms.ml.scan.HmsScan$EventInfo r0 = r2.eventInfo
            r3.writeParcelable(r0, r4)
            return
        L48:
            int r1 = com.huawei.hms.ml.scan.HmsScan.CONTACT_DETAIL_FORM
            if (r0 != r1) goto L52
            com.huawei.hms.ml.scan.HmsScan$ContactDetail r0 = r2.contactDetail
            r3.writeParcelable(r0, r4)
            return
        L52:
            int r1 = com.huawei.hms.ml.scan.HmsScan.DRIVER_INFO_FORM
            if (r0 != r1) goto L5c
            com.huawei.hms.ml.scan.HmsScan$DriverInfo r0 = r2.driverInfo
            r3.writeParcelable(r0, r4)
            return
        L5c:
            int r1 = com.huawei.hms.ml.scan.HmsScan.LOCATION_COORDINATE_FORM
            if (r0 != r1) goto L65
            com.huawei.hms.ml.scan.HmsScan$LocationCoordinate r0 = r2.locationCoordinate
            r3.writeParcelable(r0, r4)
        L65:
            return
    }

    public com.huawei.hms.ml.scan.HmsScan.ContactDetail getContactDetail() {
            r1 = this;
            com.huawei.hms.ml.scan.HmsScan$ContactDetail r0 = r1.contactDetail
            return r0
    }

    public com.huawei.hms.ml.scan.HmsScan.DriverInfo getDriverInfo() {
            r1 = this;
            com.huawei.hms.ml.scan.HmsScan$DriverInfo r0 = r1.driverInfo
            return r0
    }

    public com.huawei.hms.ml.scan.HmsScan.EmailContent getEmailContent() {
            r1 = this;
            com.huawei.hms.ml.scan.HmsScan$EmailContent r0 = r1.emailContent
            return r0
    }

    public com.huawei.hms.ml.scan.HmsScan.EventInfo getEventInfo() {
            r1 = this;
            com.huawei.hms.ml.scan.HmsScan$EventInfo r0 = r1.eventInfo
            return r0
    }

    public com.huawei.hms.ml.scan.HmsScan.LinkUrl getLinkUrl() {
            r1 = this;
            com.huawei.hms.ml.scan.HmsScan$LinkUrl r0 = r1.linkUrl
            return r0
    }

    public com.huawei.hms.ml.scan.HmsScan.LocationCoordinate getLocationCoordinate() {
            r1 = this;
            com.huawei.hms.ml.scan.HmsScan$LocationCoordinate r0 = r1.locationCoordinate
            return r0
    }

    public com.huawei.hms.ml.scan.HmsScan.SmsContent getSmsContent() {
            r1 = this;
            com.huawei.hms.ml.scan.HmsScan$SmsContent r0 = r1.smsContent
            return r0
    }

    public com.huawei.hms.ml.scan.HmsScan.TelPhoneNumber getTelPhoneNumber() {
            r1 = this;
            com.huawei.hms.ml.scan.HmsScan$TelPhoneNumber r0 = r1.telPhoneNumber
            return r0
    }

    public com.huawei.hms.ml.scan.HmsScan.WiFiConnectionInfo getWiFiConnectionInfo() {
            r1 = this;
            com.huawei.hms.ml.scan.HmsScan$WiFiConnectionInfo r0 = r1.wifiConnectionInfo
            return r0
    }

    public com.huawei.hms.ml.scan.HmsScan setZoomValue(double r1) {
            r0 = this;
            r0.zoomValue = r1
            return r0
    }

    @Override // com.huawei.hms.ml.scan.HmsScanBase, android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            return
    }
}
