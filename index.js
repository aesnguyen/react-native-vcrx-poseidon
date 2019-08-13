/**
 * @providesModule VCRX Poseidon
 */

import { DeviceEventEmitter, NativeEventEmitter, NativeModules, Platform } from 'react-native';

// const { RNJitsiMeetNavigatorManager } = NativeModules;
const { RNReactNativeVcrxPoseidon } = NativeModules;
export const JitsiMeetEvents = Platform.select({
  ios: new NativeEventEmitter(RNReactNativeVcrxPoseidon),
  android: DeviceEventEmitter,
});
// export default RNJitsiMeetNavigatorManager;
export default RNReactNativeVcrxPoseidon;
