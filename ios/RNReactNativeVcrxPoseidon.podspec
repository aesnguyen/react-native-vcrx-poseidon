
Pod::Spec.new do |s|
  s.name         = "RNReactNativeVcrxPoseidon"
  s.version      = "1.0.0"
  s.summary      = "RNReactNativeVcrxPoseidon"
  s.description  = <<-DESC
                  RNReactNativeVcrxPoseidon
                   DESC
  s.homepage     = ""
  s.license      = "MIT"
  # s.license      = { :type => "MIT", :file => "FILE_LICENSE" }
  s.author             = { "author" => "author@domain.cn" }
  s.platform     = :ios, "7.0"
  s.source       = { :git => "https://github.com/author/RNReactNativeVcrxPoseidon.git", :tag => "master" }
  s.source_files  = "RNReactNativeVcrxPoseidon/**/*.{h,m}"
  s.requires_arc = true


  s.dependency "React"
  #s.dependency "others"

end

  