package com.google.android.datatransport.cct.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class AutoBatchedLogRequestEncoder implements com.google.firebase.encoders.config.Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final com.google.firebase.encoders.config.Configurator CONFIG = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class AndroidClientInfoEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.cct.internal.AndroidClientInfo> {
        private static final com.google.firebase.encoders.FieldDescriptor APPLICATIONBUILD_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor COUNTRY_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor DEVICE_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor FINGERPRINT_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor HARDWARE_DESCRIPTOR = null;
        static final com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor LOCALE_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor MANUFACTURER_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor MCCMNC_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor MODEL_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor OSBUILD_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor PRODUCT_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor SDKVERSION_DESCRIPTOR = null;

        static {
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$AndroidClientInfoEncoder r0 = new com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$AndroidClientInfoEncoder
                r0.<init>()
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.INSTANCE = r0
                java.lang.String r0 = "sdkVersion"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.SDKVERSION_DESCRIPTOR = r0
                java.lang.String r0 = "model"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.MODEL_DESCRIPTOR = r0
                java.lang.String r0 = "hardware"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.HARDWARE_DESCRIPTOR = r0
                java.lang.String r0 = "device"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.DEVICE_DESCRIPTOR = r0
                java.lang.String r0 = "product"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.PRODUCT_DESCRIPTOR = r0
                java.lang.String r0 = "osBuild"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.OSBUILD_DESCRIPTOR = r0
                java.lang.String r0 = "manufacturer"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.MANUFACTURER_DESCRIPTOR = r0
                java.lang.String r0 = "fingerprint"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.FINGERPRINT_DESCRIPTOR = r0
                java.lang.String r0 = "locale"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.LOCALE_DESCRIPTOR = r0
                java.lang.String r0 = "country"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.COUNTRY_DESCRIPTOR = r0
                java.lang.String r0 = "mccMnc"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.MCCMNC_DESCRIPTOR = r0
                java.lang.String r0 = "applicationBuild"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.APPLICATIONBUILD_DESCRIPTOR = r0
                return
        }

        private AndroidClientInfoEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.android.datatransport.cct.internal.AndroidClientInfo r3, com.google.firebase.encoders.ObjectEncoderContext r4) throws java.io.IOException {
                r2 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.SDKVERSION_DESCRIPTOR
                java.lang.Integer r1 = r3.getSdkVersion()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.MODEL_DESCRIPTOR
                java.lang.String r1 = r3.getModel()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.HARDWARE_DESCRIPTOR
                java.lang.String r1 = r3.getHardware()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.DEVICE_DESCRIPTOR
                java.lang.String r1 = r3.getDevice()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.PRODUCT_DESCRIPTOR
                java.lang.String r1 = r3.getProduct()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.OSBUILD_DESCRIPTOR
                java.lang.String r1 = r3.getOsBuild()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.MANUFACTURER_DESCRIPTOR
                java.lang.String r1 = r3.getManufacturer()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.FINGERPRINT_DESCRIPTOR
                java.lang.String r1 = r3.getFingerprint()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.LOCALE_DESCRIPTOR
                java.lang.String r1 = r3.getLocale()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.COUNTRY_DESCRIPTOR
                java.lang.String r1 = r3.getCountry()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.MCCMNC_DESCRIPTOR
                java.lang.String r1 = r3.getMccMnc()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.APPLICATIONBUILD_DESCRIPTOR
                java.lang.String r3 = r3.getApplicationBuild()
                r4.add(r0, r3)
                return
        }

        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.android.datatransport.cct.internal.AndroidClientInfo r1 = (com.google.android.datatransport.cct.internal.AndroidClientInfo) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class BatchedLogRequestEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.cct.internal.BatchedLogRequest> {
        static final com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.BatchedLogRequestEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor LOGREQUEST_DESCRIPTOR = null;

        static {
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$BatchedLogRequestEncoder r0 = new com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$BatchedLogRequestEncoder
                r0.<init>()
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.BatchedLogRequestEncoder.INSTANCE = r0
                java.lang.String r0 = "logRequest"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.BatchedLogRequestEncoder.LOGREQUEST_DESCRIPTOR = r0
                return
        }

        private BatchedLogRequestEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.android.datatransport.cct.internal.BatchedLogRequest r2, com.google.firebase.encoders.ObjectEncoderContext r3) throws java.io.IOException {
                r1 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.BatchedLogRequestEncoder.LOGREQUEST_DESCRIPTOR
                java.util.List r2 = r2.getLogRequests()
                r3.add(r0, r2)
                return
        }

        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.android.datatransport.cct.internal.BatchedLogRequest r1 = (com.google.android.datatransport.cct.internal.BatchedLogRequest) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class ClientInfoEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.cct.internal.ClientInfo> {
        private static final com.google.firebase.encoders.FieldDescriptor ANDROIDCLIENTINFO_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor CLIENTTYPE_DESCRIPTOR = null;
        static final com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ClientInfoEncoder INSTANCE = null;

        static {
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$ClientInfoEncoder r0 = new com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$ClientInfoEncoder
                r0.<init>()
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ClientInfoEncoder.INSTANCE = r0
                java.lang.String r0 = "clientType"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ClientInfoEncoder.CLIENTTYPE_DESCRIPTOR = r0
                java.lang.String r0 = "androidClientInfo"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ClientInfoEncoder.ANDROIDCLIENTINFO_DESCRIPTOR = r0
                return
        }

        private ClientInfoEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.android.datatransport.cct.internal.ClientInfo r3, com.google.firebase.encoders.ObjectEncoderContext r4) throws java.io.IOException {
                r2 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ClientInfoEncoder.CLIENTTYPE_DESCRIPTOR
                com.google.android.datatransport.cct.internal.ClientInfo$ClientType r1 = r3.getClientType()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ClientInfoEncoder.ANDROIDCLIENTINFO_DESCRIPTOR
                com.google.android.datatransport.cct.internal.AndroidClientInfo r3 = r3.getAndroidClientInfo()
                r4.add(r0, r3)
                return
        }

        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.android.datatransport.cct.internal.ClientInfo r1 = (com.google.android.datatransport.cct.internal.ClientInfo) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class LogEventEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.cct.internal.LogEvent> {
        private static final com.google.firebase.encoders.FieldDescriptor EVENTCODE_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor EVENTTIMEMS_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor EVENTUPTIMEMS_DESCRIPTOR = null;
        static final com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogEventEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor NETWORKCONNECTIONINFO_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor SOURCEEXTENSIONJSONPROTO3_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor SOURCEEXTENSION_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor TIMEZONEOFFSETSECONDS_DESCRIPTOR = null;

        static {
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$LogEventEncoder r0 = new com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$LogEventEncoder
                r0.<init>()
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogEventEncoder.INSTANCE = r0
                java.lang.String r0 = "eventTimeMs"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogEventEncoder.EVENTTIMEMS_DESCRIPTOR = r0
                java.lang.String r0 = "eventCode"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogEventEncoder.EVENTCODE_DESCRIPTOR = r0
                java.lang.String r0 = "eventUptimeMs"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogEventEncoder.EVENTUPTIMEMS_DESCRIPTOR = r0
                java.lang.String r0 = "sourceExtension"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogEventEncoder.SOURCEEXTENSION_DESCRIPTOR = r0
                java.lang.String r0 = "sourceExtensionJsonProto3"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogEventEncoder.SOURCEEXTENSIONJSONPROTO3_DESCRIPTOR = r0
                java.lang.String r0 = "timezoneOffsetSeconds"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogEventEncoder.TIMEZONEOFFSETSECONDS_DESCRIPTOR = r0
                java.lang.String r0 = "networkConnectionInfo"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogEventEncoder.NETWORKCONNECTIONINFO_DESCRIPTOR = r0
                return
        }

        private LogEventEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.android.datatransport.cct.internal.LogEvent r4, com.google.firebase.encoders.ObjectEncoderContext r5) throws java.io.IOException {
                r3 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogEventEncoder.EVENTTIMEMS_DESCRIPTOR
                long r1 = r4.getEventTimeMs()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogEventEncoder.EVENTCODE_DESCRIPTOR
                java.lang.Integer r1 = r4.getEventCode()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogEventEncoder.EVENTUPTIMEMS_DESCRIPTOR
                long r1 = r4.getEventUptimeMs()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogEventEncoder.SOURCEEXTENSION_DESCRIPTOR
                byte[] r1 = r4.getSourceExtension()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogEventEncoder.SOURCEEXTENSIONJSONPROTO3_DESCRIPTOR
                java.lang.String r1 = r4.getSourceExtensionJsonProto3()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogEventEncoder.TIMEZONEOFFSETSECONDS_DESCRIPTOR
                long r1 = r4.getTimezoneOffsetSeconds()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogEventEncoder.NETWORKCONNECTIONINFO_DESCRIPTOR
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo r4 = r4.getNetworkConnectionInfo()
                r5.add(r0, r4)
                return
        }

        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.android.datatransport.cct.internal.LogEvent r1 = (com.google.android.datatransport.cct.internal.LogEvent) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class LogRequestEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.cct.internal.LogRequest> {
        private static final com.google.firebase.encoders.FieldDescriptor CLIENTINFO_DESCRIPTOR = null;
        static final com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogRequestEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor LOGEVENT_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor LOGSOURCENAME_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor LOGSOURCE_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor QOSTIER_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor REQUESTTIMEMS_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor REQUESTUPTIMEMS_DESCRIPTOR = null;

        static {
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$LogRequestEncoder r0 = new com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$LogRequestEncoder
                r0.<init>()
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogRequestEncoder.INSTANCE = r0
                java.lang.String r0 = "requestTimeMs"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogRequestEncoder.REQUESTTIMEMS_DESCRIPTOR = r0
                java.lang.String r0 = "requestUptimeMs"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogRequestEncoder.REQUESTUPTIMEMS_DESCRIPTOR = r0
                java.lang.String r0 = "clientInfo"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogRequestEncoder.CLIENTINFO_DESCRIPTOR = r0
                java.lang.String r0 = "logSource"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogRequestEncoder.LOGSOURCE_DESCRIPTOR = r0
                java.lang.String r0 = "logSourceName"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogRequestEncoder.LOGSOURCENAME_DESCRIPTOR = r0
                java.lang.String r0 = "logEvent"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogRequestEncoder.LOGEVENT_DESCRIPTOR = r0
                java.lang.String r0 = "qosTier"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogRequestEncoder.QOSTIER_DESCRIPTOR = r0
                return
        }

        private LogRequestEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.android.datatransport.cct.internal.LogRequest r4, com.google.firebase.encoders.ObjectEncoderContext r5) throws java.io.IOException {
                r3 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogRequestEncoder.REQUESTTIMEMS_DESCRIPTOR
                long r1 = r4.getRequestTimeMs()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogRequestEncoder.REQUESTUPTIMEMS_DESCRIPTOR
                long r1 = r4.getRequestUptimeMs()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogRequestEncoder.CLIENTINFO_DESCRIPTOR
                com.google.android.datatransport.cct.internal.ClientInfo r1 = r4.getClientInfo()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogRequestEncoder.LOGSOURCE_DESCRIPTOR
                java.lang.Integer r1 = r4.getLogSource()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogRequestEncoder.LOGSOURCENAME_DESCRIPTOR
                java.lang.String r1 = r4.getLogSourceName()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogRequestEncoder.LOGEVENT_DESCRIPTOR
                java.util.List r1 = r4.getLogEvents()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogRequestEncoder.QOSTIER_DESCRIPTOR
                com.google.android.datatransport.cct.internal.QosTier r4 = r4.getQosTier()
                r5.add(r0, r4)
                return
        }

        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.android.datatransport.cct.internal.LogRequest r1 = (com.google.android.datatransport.cct.internal.LogRequest) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class NetworkConnectionInfoEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.cct.internal.NetworkConnectionInfo> {
        static final com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.NetworkConnectionInfoEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor MOBILESUBTYPE_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor NETWORKTYPE_DESCRIPTOR = null;

        static {
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$NetworkConnectionInfoEncoder r0 = new com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$NetworkConnectionInfoEncoder
                r0.<init>()
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.NetworkConnectionInfoEncoder.INSTANCE = r0
                java.lang.String r0 = "networkType"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.NetworkConnectionInfoEncoder.NETWORKTYPE_DESCRIPTOR = r0
                java.lang.String r0 = "mobileSubtype"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.NetworkConnectionInfoEncoder.MOBILESUBTYPE_DESCRIPTOR = r0
                return
        }

        private NetworkConnectionInfoEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.android.datatransport.cct.internal.NetworkConnectionInfo r3, com.google.firebase.encoders.ObjectEncoderContext r4) throws java.io.IOException {
                r2 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.NetworkConnectionInfoEncoder.NETWORKTYPE_DESCRIPTOR
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType r1 = r3.getNetworkType()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.NetworkConnectionInfoEncoder.MOBILESUBTYPE_DESCRIPTOR
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype r3 = r3.getMobileSubtype()
                r4.add(r0, r3)
                return
        }

        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo r1 = (com.google.android.datatransport.cct.internal.NetworkConnectionInfo) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    static {
            com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder r0 = new com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder
            r0.<init>()
            com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.CONFIG = r0
            return
    }

    private AutoBatchedLogRequestEncoder() {
            r0 = this;
            r0.<init>()
            return
    }

    public void configure(com.google.firebase.encoders.config.EncoderConfig<?> r3) {
            r2 = this;
            com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$BatchedLogRequestEncoder r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.BatchedLogRequestEncoder.INSTANCE
            java.lang.Class<com.google.android.datatransport.cct.internal.BatchedLogRequest> r1 = com.google.android.datatransport.cct.internal.BatchedLogRequest.class
            r3.registerEncoder(r1, r0)
            java.lang.Class<com.google.android.datatransport.cct.internal.AutoValue_BatchedLogRequest> r1 = com.google.android.datatransport.cct.internal.AutoValue_BatchedLogRequest.class
            r3.registerEncoder(r1, r0)
            com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$LogRequestEncoder r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogRequestEncoder.INSTANCE
            java.lang.Class<com.google.android.datatransport.cct.internal.LogRequest> r1 = com.google.android.datatransport.cct.internal.LogRequest.class
            r3.registerEncoder(r1, r0)
            java.lang.Class<com.google.android.datatransport.cct.internal.AutoValue_LogRequest> r1 = com.google.android.datatransport.cct.internal.AutoValue_LogRequest.class
            r3.registerEncoder(r1, r0)
            com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$ClientInfoEncoder r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ClientInfoEncoder.INSTANCE
            java.lang.Class<com.google.android.datatransport.cct.internal.ClientInfo> r1 = com.google.android.datatransport.cct.internal.ClientInfo.class
            r3.registerEncoder(r1, r0)
            java.lang.Class<com.google.android.datatransport.cct.internal.AutoValue_ClientInfo> r1 = com.google.android.datatransport.cct.internal.AutoValue_ClientInfo.class
            r3.registerEncoder(r1, r0)
            com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$AndroidClientInfoEncoder r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.INSTANCE
            java.lang.Class<com.google.android.datatransport.cct.internal.AndroidClientInfo> r1 = com.google.android.datatransport.cct.internal.AndroidClientInfo.class
            r3.registerEncoder(r1, r0)
            java.lang.Class<com.google.android.datatransport.cct.internal.AutoValue_AndroidClientInfo> r1 = com.google.android.datatransport.cct.internal.AutoValue_AndroidClientInfo.class
            r3.registerEncoder(r1, r0)
            com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$LogEventEncoder r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogEventEncoder.INSTANCE
            java.lang.Class<com.google.android.datatransport.cct.internal.LogEvent> r1 = com.google.android.datatransport.cct.internal.LogEvent.class
            r3.registerEncoder(r1, r0)
            java.lang.Class<com.google.android.datatransport.cct.internal.AutoValue_LogEvent> r1 = com.google.android.datatransport.cct.internal.AutoValue_LogEvent.class
            r3.registerEncoder(r1, r0)
            com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$NetworkConnectionInfoEncoder r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.NetworkConnectionInfoEncoder.INSTANCE
            java.lang.Class<com.google.android.datatransport.cct.internal.NetworkConnectionInfo> r1 = com.google.android.datatransport.cct.internal.NetworkConnectionInfo.class
            r3.registerEncoder(r1, r0)
            java.lang.Class<com.google.android.datatransport.cct.internal.AutoValue_NetworkConnectionInfo> r1 = com.google.android.datatransport.cct.internal.AutoValue_NetworkConnectionInfo.class
            r3.registerEncoder(r1, r0)
            return
    }
}
