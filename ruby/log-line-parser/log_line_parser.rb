class LogLineParser
  attr_reader :message, :log_level

  def initialize(line)
    @line = line
    @message = line[/(?<=\: ).*/].strip
    @log_level = line[/(?<=\[)\w*(?=\])/].downcase
  end

  def reformat
    "#{message} (#{log_level})"
  end
end
