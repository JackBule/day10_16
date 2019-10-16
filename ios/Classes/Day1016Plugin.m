#import "Day1016Plugin.h"
#import <day10_16/day10_16-Swift.h>

@implementation Day1016Plugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  [SwiftDay1016Plugin registerWithRegistrar:registrar];
}
@end
