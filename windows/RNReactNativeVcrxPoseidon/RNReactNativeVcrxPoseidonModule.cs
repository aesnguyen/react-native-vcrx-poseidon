using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace React.Native.Vcrx.Poseidon.RNReactNativeVcrxPoseidon
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNReactNativeVcrxPoseidonModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNReactNativeVcrxPoseidonModule"/>.
        /// </summary>
        internal RNReactNativeVcrxPoseidonModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNReactNativeVcrxPoseidon";
            }
        }
    }
}
